package com.latsyna.spring.modulith;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

/**
 * Test class to verify modules.
 */
class ApplicationModulithTest {

  @Test
  void displayAndVerifyModules() {
    var modules = ApplicationModules.of(SpringModulithPocApplication.class).verify();;
    System.out.println("Modules:");
    modules.forEach(System.out::println);
  }

  @Test
  void createModuleDocumentation() {
    ApplicationModules modules = ApplicationModules.of(SpringModulithPocApplication.class);
    new Documenter(modules)
        .writeDocumentation()
        .writeIndividualModulesAsPlantUml();
  }

}
