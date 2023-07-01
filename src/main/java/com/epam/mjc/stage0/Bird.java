package com.epam.mjc.stage0;


public class Bird extends Animal{

    public Bird () {
        super("blue", 2, false);
    }

    @Override
    public String getDescription (){
        String description = "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + (getNumberOfPaws() == 1 ? " paw" : " paws") + " and" + (isHasFur() ? " a" : " no") + " fur. Moreover, it has 2 wings and can fly." ;
        return description;
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        System.out.println(bird.getDescription());
    }

}

