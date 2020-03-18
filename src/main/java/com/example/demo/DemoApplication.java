package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.demo.repositories")
@EntityScan(basePackages = "com.example.demo.entity")
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }



//    1- Para gerar um war Tomcat é necesário colocar a dependencia en Pom
//
//            <dependency>
//            <groupId>org.springframework.boot</groupId>
//            <artifactId>spring-boot-starter-tomcat</artifactId>
//            <scope>provided</scope>
//        </dependency>
//    2 - DemoApplication extender SpringBootServletInitializer
//    3 - Mudar o build como está abaixo.
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return super.configure(builder);
//    }
//    4 - mvn clean compile
//    5 - mvn clean package
//


}
