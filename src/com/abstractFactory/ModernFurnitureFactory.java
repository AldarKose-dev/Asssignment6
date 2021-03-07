package com.abstractFactory;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public CoffeeTable createCofeeTable() {

        return new ModernCoffeeTable();
    }

    @Override
    public Sofa createSofa() {

        return new ModernSofa();
    }
}
