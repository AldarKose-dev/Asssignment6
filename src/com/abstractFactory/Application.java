package com.abstractFactory;

public class Application {

    private Chair chair;
    private CoffeeTable coffeeTable;
    private Sofa sofa;

    Application(FurnitureFactory factory){
        chair = factory.createChair();
        coffeeTable = factory.createCofeeTable();
        sofa = factory.createSofa();
    }

    public void output() {
        chair.sitOn();
        chair.hasLegs();
        coffeeTable.putCofee();
        coffeeTable.hasLegs();
        sofa.sitOn();
        sofa.hasLegs();
    }


}