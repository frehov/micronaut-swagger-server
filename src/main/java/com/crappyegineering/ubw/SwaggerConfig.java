package com.crappyegineering.ubw;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties("application.api.swagger")
public class SwaggerConfig {

    private String version;
    private String path;
    private String layout;
    private boolean deepLinking;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public boolean isDeepLinking() {
        return deepLinking;
    }

    public void setDeepLinking(boolean deepLinking) {
        this.deepLinking = deepLinking;
    }
}
