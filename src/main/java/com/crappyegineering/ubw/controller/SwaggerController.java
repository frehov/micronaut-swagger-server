package com.crappyegineering.ubw.controller;

import static java.util.Collections.singletonList;

import java.util.List;

import javax.inject.Inject;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.crappyegineering.ubw.SwaggerConfig;
import com.crappyegineering.ubw.SwaggerConfig.URIConfig;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
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
    public SwaggerConfig index() {
        return config;
    }

    @View("swagger/index")
    @Get("/{url}")
    public SwaggerConfig renderSpec(@NotNull String url) {
        return new SwaggerConfig.Builder()
                .withDeepLinking(config.isDeepLinking())
                .withLayout(config.getLayout())
                .withVersion(config.getVersion())
                .withUrls(singletonList(new URIConfig.Builder()
                        .withName(url)
                        .withURI(url)
                        .build()))
                .build();
    }

    @View("swagger/index")
    @Post
    public SwaggerConfig renderSpecs(@Body @NotEmpty List<URIConfig> urls) {
        return new SwaggerConfig.Builder()
                .withDeepLinking(config.isDeepLinking())
                .withLayout(config.getLayout())
                .withVersion(config.getVersion())
                .withUrls(urls)
                .build();
    }

}
