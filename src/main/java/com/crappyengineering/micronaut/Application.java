package com.crappyengineering.micronaut;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;


@OpenAPIDefinition(
        info = @Info(
                title = "swagger-server",
                version = "0.1",
                description = "My API",
                license = @License(name = "Apache 2.0")
        )
)
public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class);
    }
}