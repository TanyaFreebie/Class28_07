package com.company.HomeAsigment.Bardy;

public class Bardy extends Car {

    private int noOfSeats;
    private boolean isGoldPlated;

    public Bardy(int numberOfTires, String color, int noOfSeats, boolean isGoldPlated) {
        super(numberOfTires, color);
        this.noOfSeats = noOfSeats;
        this.isGoldPlated = isGoldPlated;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    public boolean isGoldPlated() {
        return isGoldPlated;
    }

    public void setGoldPlated(boolean goldPlated) {
        isGoldPlated = goldPlated;
    }
}
