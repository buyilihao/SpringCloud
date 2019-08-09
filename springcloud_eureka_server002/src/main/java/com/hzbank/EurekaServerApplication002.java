package com.hzbank;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication002 {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServerApplication002.class).web(true).run(args);
    }
}
