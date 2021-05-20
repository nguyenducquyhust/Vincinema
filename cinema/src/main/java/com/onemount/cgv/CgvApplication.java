package com.onemount.cgv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
//@EnableConfigurationProperties
////@EntityScan(basePackages = {"com.onemount.cgv.model"})
//@EnableJpaAuditing
public class CgvApplication {

    public static void main(String[] args) {
        SpringApplication.run(CgvApplication.class, args);
    }

}
