package com.crappyegineering.ubw.controller;

import static io.micronaut.http.HttpResponse.ok;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.views.View;
import io.swagger.v3.oas.annotations.Hidden;

@Hidden
@Controller("/api")
public class SwaggerController {

    @View("swagger/index")
    @Get
    public HttpResponse index() {
        return ok();
    }
}
