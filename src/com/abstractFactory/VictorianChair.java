package com.abstractFactory;

public class VictorianChair implements Chair{
    @Override
    public void hasLegs() {
        System.out.println("Victorian chair has 4 legs");
    }
    @Override
    public void sitOn() {
        System.out.println("Sitting on the victorian chair");
    }
}
