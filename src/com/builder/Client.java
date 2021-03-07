package com.builder;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        HouseBuilder builder = new HouseBuilder();
        director.createHouse(builder);

        House house = builder.getResult();
        System.out.println(house.toString());

        HouseWithFancyStatuesBuilder h = new HouseWithFancyStatuesBuilder();
        director.createHouseWithFancyStatues(h);

        HouseWithFancyStatues houseWithFancyStatuesBuilder = h.getResult();
        System.out.println(houseWithFancyStatuesBuilder.toString());

    }
}
