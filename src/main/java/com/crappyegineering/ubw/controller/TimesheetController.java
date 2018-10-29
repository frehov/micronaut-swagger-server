package com.crappyegineering.ubw.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.HttpStatus;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@Controller("/api/timesheet")
public class TimesheetController {

    @Get
    @ApiResponse(description = "Provides a simple OK back to the user")
    public HttpStatus index() {
        return HttpStatus.OK;
    }
}