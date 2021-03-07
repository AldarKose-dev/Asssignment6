package com.builder;

public class HouseWithFancyStatuesBuilder implements Builder{
    String walls;
    int windows;
    int doors;
    int rooms;
    boolean hasGarage;
    boolean hasSwimPool;
    boolean hasStatues;
    boolean hasGarden;

    @Override
    public void setWalls(String walls) {
        this.walls = walls;
    }

    @Override
    public void setWindows(int windows) {
        this.windows = windows;
    }

    @Override
    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    @Override
    public void setHasGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
    }

    @Override
    public void setHasSwimPool(boolean hasSwimPool) {
        this.hasSwimPool = hasSwimPool;
    }

    @Override
    public void setHasStatues(boolean hasStatues) {
        this.hasStatues = hasStatues;
    }

    @Override
    public void setHasGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
    }



    public HouseWithFancyStatues getResult(){
        return new HouseWithFancyStatues(walls, windows, doors, rooms, hasGarage, hasSwimPool, hasStatues, hasGarden);
    }
}
