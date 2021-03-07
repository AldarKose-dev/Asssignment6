package com.abstractFactory;

public class ModernChair implements Chair{
    @Override
    public void hasLegs() {
        System.out.println("Chair has 4 legs");
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on a modern chair");
    }
}
