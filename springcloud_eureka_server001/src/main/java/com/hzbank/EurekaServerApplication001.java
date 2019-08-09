package com.hzbank;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication001 {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaServerApplication001.class).web(true).run(args);
    }

}
