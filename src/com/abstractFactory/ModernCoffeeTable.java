package com.abstractFactory;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void hasLegs() {
        System.out.println("Modern coffee table has 4 legs");
    }

    @Override
    public void putCofee() {
        System.out.println("Putting coffee on coffee table");
    }
}
