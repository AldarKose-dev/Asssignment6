package com.factory;

public class Application {
    public static void main(String[] args) {
    Logistics s1 = new RoadLogistics();
    System.out.println(s1.createTransport());
    Transport str = new Truck();
    str.deliver();
    }
}
