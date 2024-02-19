//allow module dependencies
@org.springframework.modulith.ApplicationModule(
    allowedDependencies = {"product", "notification"
            //, "product::internal"
    }
)
package com.latsyna.spring.modulith.api;
