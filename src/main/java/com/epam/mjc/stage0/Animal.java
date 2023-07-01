package com.epam.mjc.stage0;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal (String color , int numberOfPaws , boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfPaws() {
        return numberOfPaws;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public String getDescription (){
        String description = "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + (getNumberOfPaws() == 1 ? " paw" : " paws") + " and" + (isHasFur() ? " a" : " no") + " fur." ;
        return description;
    }
}
