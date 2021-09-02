package com.company.HomeAsigment.Bardy;

public class Car {
    private int numberOfTires;
    private String color;

    public Car(int numberOfTires, String color){
        this.numberOfTires = numberOfTires;
        this.color = color;
    }

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
