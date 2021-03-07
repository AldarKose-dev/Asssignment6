package com.abstractFactory;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public CoffeeTable createCofeeTable() {
        return new VictorianCoffeeTable();

    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
