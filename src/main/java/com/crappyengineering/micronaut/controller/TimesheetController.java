package com.crappyengineering.micronaut.controller;

import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.validation.Validated;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@Validated
@Controller("/api/ok")
public class TimesheetController {

    @Get
    @ApiResponse(description = "Provides a simple OK back to the user")
    public HttpStatus index() {
        return HttpStatus.OK;
    }

}