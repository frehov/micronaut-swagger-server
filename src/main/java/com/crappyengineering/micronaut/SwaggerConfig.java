package com.crappyengineering.micronaut;

import java.util.List;

import io.micronaut.context.annotation.ConfigurationProperties;

@ConfigurationProperties(SwaggerConfig.PREFIX)
public class SwaggerConfig {

    public static final String PREFIX = "application.api.swagger";

    private String version;
    private String layout;
    private boolean deepLinking;
    private List<URIConfig> urls;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
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

    public List<URIConfig> getUrls() {
        return urls;
    }

    public void setUrls(List<URIConfig> urls) {
        this.urls = urls;
    }

    @Override
    public String toString() {
        return "SwaggerConfig{" +
                "version='" + version + '\'' +
                ", layout='" + layout + '\'' +
                ", deepLinking=" + deepLinking +
                ", specs=" + urls +
                '}';
    }

    @ConfigurationProperties(URIConfig.PREFIX)
    public static class URIConfig {

        static final String PREFIX = "urls";

        private String name;
        private String url;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        @Override
        public String toString() {
            return "URIConfig{" +
                    "name='" + name + '\'' +
                    ", url='" + url + '\'' +
                    '}';
        }

        public static class Builder {
            private String name;
            private String url;

            public Builder withName(String name) {
                this.name = name;
                return this;
            }

            public Builder withURI(String url) {
                this.url = url;
                return this;
            }

            public URIConfig build() {
                URIConfig uriConfig = new URIConfig();
                uriConfig.setName(name);
                uriConfig.setUrl(url);
                return uriConfig;
            }
        }

    }

    public static class Builder {
        private String version;
        private String layout;
        private boolean deepLinking;
        private List<URIConfig> urls;

        public Builder withVersion(String version) {
            this.version = version;
            return this;
        }

        public Builder withLayout(String layout) {
            this.layout = layout;
            return this;
        }

        public Builder withDeepLinking(boolean deepLinking) {
            this.deepLinking = deepLinking;
            return this;
        }

        public Builder withUrls(List<URIConfig> urls) {
            this.urls = urls;
            return this;
        }

        public SwaggerConfig build() {
            SwaggerConfig swaggerConfig = new SwaggerConfig();
            swaggerConfig.setVersion(version);
            swaggerConfig.setLayout(layout);
            swaggerConfig.setDeepLinking(deepLinking);
            swaggerConfig.setUrls(urls);
            return swaggerConfig;
        }
    }
}
