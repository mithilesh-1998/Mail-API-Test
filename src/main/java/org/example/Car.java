package org.example;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private String color;

    public Car() {
        this.color = "Red";
        System.out.println("Car object Created !!!!!!");

    }
    public Car(String color) {
        System.out.println("color of the car is:" + color);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
