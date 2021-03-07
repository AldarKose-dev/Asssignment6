package com.abstractFactory;

public class ModernSofa implements Sofa {
    @Override
    public void hasLegs() {
        System.out.println("Sofa has 4 legs");
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on modern sofa");
    }
}
