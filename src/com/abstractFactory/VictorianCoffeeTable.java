package com.abstractFactory;

public class VictorianCoffeeTable implements CoffeeTable {

    @Override
    public void hasLegs() {
        System.out.println("Victorian coffee table has 4 legs");
    }

    @Override
    public void putCofee() {
        System.out.println("Putting coffee on the coffee table");
    }
}
