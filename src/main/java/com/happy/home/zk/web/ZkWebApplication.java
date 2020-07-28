package com.happy.home.zk.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ZkWebApplication {

    public static void main(String[] args) throws Exception
    {
        SpringApplication.run(ZkWebApplication.class, args);
    }
}
