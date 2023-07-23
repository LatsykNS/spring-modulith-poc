# Spring Modulith POC
This is a POC project for Spring Modulith framework.

## Getting Started
### Requirements
* Java 17
* Gradle 8.1.1
* Spring Boot 3

### How to run
To run application locally use the next gradle command: 
`gradlew bootRun`

## Code
### Modules
```
Modules:
# Product
> Logical name: product
> Base package: com.latsyna.spring.modulith.product
> Spring beans:
  o ….internal.ProductServiceImpl

# Notification
> Logical name: notification
> Base package: com.latsyna.spring.modulith.notification
> Spring beans:
  + ….NotificationService

# Api
> Logical name: api
> Base package: com.latsyna.spring.modulith.api
> Spring beans:
  + ….NotificationApi
  + ….ProductApi
```
### Diagram
```plantuml
@startuml
title SpringModulithPocApplication

top to bottom direction

!include https://raw.githubusercontent.com/plantuml-stdlib/C4-PlantUML/master/C4.puml
!include https://raw.githubusercontent.com/plantuml-stdlib/C4-PlantUML/master/C4_Context.puml
!include https://raw.githubusercontent.com/plantuml-stdlib/C4-PlantUML/master/C4_Component.puml

Container_Boundary("SpringModulithPocApplication.SpringModulithPocApplication_boundary", "SpringModulithPocApplication", $tags="") {
  Component(SpringModulithPocApplication.SpringModulithPocApplication.Product, "Product", "Module", "", $tags="")
  Component(SpringModulithPocApplication.SpringModulithPocApplication.Notification, "Notification", "Module", "", $tags="")
  Component(SpringModulithPocApplication.SpringModulithPocApplication.Api, "Api", "Module", "", $tags="")
}

Rel_D(SpringModulithPocApplication.SpringModulithPocApplication.Api, SpringModulithPocApplication.SpringModulithPocApplication.Notification, "depends on", $tags="")
Rel_D(SpringModulithPocApplication.SpringModulithPocApplication.Api, SpringModulithPocApplication.SpringModulithPocApplication.Product, "uses", $tags="")

SHOW_LEGEND(true)
@enduml
```

## Reference documentation
* https://www.baeldung.com/spring-modulith
* https://docs.spring.io/spring-modulith/docs/1.0.0-SNAPSHOT/reference/html/#preface