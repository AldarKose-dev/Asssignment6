package com.abstractFactory;

public class VictorianSofa implements Sofa {
    @Override
    public void hasLegs() {
        System.out.println("Victorian sofa has 4 legs");

    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on the victorian sofa");
    }
}

