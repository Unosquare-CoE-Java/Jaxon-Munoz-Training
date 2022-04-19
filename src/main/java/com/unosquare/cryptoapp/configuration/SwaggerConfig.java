package com.unosquare.cryptoapp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.unosquare.cryptoapp.rest"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getApiInfo())
                ;
    }

    private ApiInfo getApiInfo() {
        return new ApiInfo(
                "User Registration Service - Crypto App",
                "User registration service is a personal project to use a lot of technologies that includes Java 11, Maven, Docker, MongoDB, Junit, Spring and more",
                "1.0",
                "",
                new Contact("Jaxon Muñoz", "https://github.com/jaxonjma", "jaxonma@gmail.com"),
                "",
                "",
                Collections.emptyList()
        );
    }
}