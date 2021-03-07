package com.builder;

public class Director {

    public void createHouse(Builder builder){
        builder.setDoors(4);
        builder.setHasGarage(false);
        builder.setWalls("wood");
        builder.setRooms(6);
        builder.setWindows(6);
        builder.setHasGarden(false);
        builder.setHasStatues(false);
        builder.setHasSwimPool(false);
    }


    public void createHouseWithGarage(Builder builder){
    builder.setDoors(2);
    builder.setHasGarage(true);
    builder.setWalls("stone");
    builder.setRooms(9);
    builder.setWindows(8);
    builder.setHasGarden(false);
    builder.setHasStatues(false);
    builder.setHasSwimPool(false);
    }

    public void createHouseWithGarden(Builder builder){
        builder.setDoors(9);
        builder.setHasGarden(true);
        builder.setWalls("glass");
        builder.setRooms(11);
        builder.setWindows(19);
        builder.setHasGarage(false);
        builder.setHasStatues(false);
        builder.setHasSwimPool(false);
    }
    public void createHouseWithSwimmingPool(Builder builder){
        builder.setDoors(7);
        builder.setHasGarden(false);
        builder.setWalls("brick");
        builder.setRooms(9);
        builder.setWindows(10);
        builder.setHasGarage(false);
        builder.setHasStatues(false);
        builder.setHasSwimPool(true);
    }
    public void createHouseWithFancyStatues(Builder builder){
        builder.setDoors(6);
        builder.setHasGarden(false);
        builder.setWalls("wood");
        builder.setRooms(16);
        builder.setWindows(23);
        builder.setHasGarage(false);
        builder.setHasStatues(true);
        builder.setHasSwimPool(false);
    }


}
