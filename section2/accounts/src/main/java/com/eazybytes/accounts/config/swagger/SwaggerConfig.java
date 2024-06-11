package com.eazybytes.accounts.config.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@AutoConfigureAfter
public class SwaggerConfig {

    static final String MANAGEMENT_GROUP_NAME = "public";


    @Bean
    public GroupedOpenApi publicOpenApi() {
        return GroupedOpenApi.builder()
                .group(MANAGEMENT_GROUP_NAME)
                .pathsToMatch("/**")
                .build();
    }

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Hello")
                        .description("Hey There")
                        .version("0.0.1")
                        .termsOfService("")
                        .license(new License().url("")));
    }
}