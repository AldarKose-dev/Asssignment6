package com.factory;

public class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Shipping by land...");
    }
}
