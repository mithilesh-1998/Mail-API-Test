package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ObjectCreate {
    public ObjectCreate() {
        System.out.println("Configuration does create object!!!");
    }
    @Bean
    @Primary
    public Car createBlueCar()
    {
        System.out.println("Testing class method");
        return new Car("Blue");
    }
}
