package com.crappyegineering.ubw.controller;

import static io.micronaut.http.HttpResponse.ok;
import static java.util.Collections.singletonList;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;

import com.crappyegineering.ubw.SwaggerConfig;
import com.crappyegineering.ubw.SwaggerConfig.URIConfig;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.validation.Validated;
import io.micronaut.views.View;
import io.swagger.v3.oas.annotations.Hidden;

@Hidden
@Controller("/api")
@Validated
public class SwaggerController {

    @Inject
    SwaggerConfig config;

    @View("swagger/index")
    @Get
    public HttpResponse index() {
        return ok(config);
    }

    @View("swagger/index")
    @Get("/{url}")
    public HttpResponse renderSpec(@NotNull String url) {
        SwaggerConfig tmpConfig = new SwaggerConfig.Builder()
                .withDeepLinking(config.isDeepLinking())
                .withLayout(config.getLayout())
                .withVersion(config.getVersion())
                .withUrls(singletonList(new URIConfig.Builder()
                        .withName(url)
                        .withURI(url)
                        .build()))
                .build();

        return ok(tmpConfig);
    }

}
