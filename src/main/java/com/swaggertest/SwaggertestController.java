package com.swaggertest;

import io.micronaut.http.annotation.*;

@Controller("/swaggertest")
public class SwaggertestController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}