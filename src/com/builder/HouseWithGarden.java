package com.builder;

public class HouseWithGarden {
    String walls;
    int windows;
    int doors;
    int rooms;
    boolean hasGarage;
    boolean hasSwimPool;
    boolean hasStatues;
    boolean hasGarden;

    public String getWalls() {
        return walls;
    }

    public int getWindows() {
        return windows;
    }

    public int getDoors() {
        return doors;
    }

    public int getRooms() {
        return rooms;
    }

    public boolean isHasGarage() {
        return hasGarage;
    }

    public boolean isHasSwimPool() {
        return hasSwimPool;
    }

    public boolean isHasStatues() {
        return hasStatues;
    }

    public boolean isHasGarden() {
        return hasGarden;
    }

    public HouseWithGarden(String walls, int windows, int doors, int rooms, boolean hasGarage, boolean hasSwimPool, boolean hasStatues, boolean hasGarden) {
        this.windows = windows;
        this.doors = doors;
        this.rooms = rooms;
        this.hasGarage = hasGarage;
        this.hasSwimPool = hasSwimPool;
        this.hasStatues = hasStatues;
        this.hasGarden = hasGarden;
    }

    @Override
    public String toString() {
        return "HouseWithGarden{" +
                "walls='" + walls + '\'' +
                ", windows=" + windows +
                ", doors=" + doors +
                ", rooms=" + rooms +
                ", hasGarage=" + hasGarage +
                ", hasSwimPool=" + hasSwimPool +
                ", hasStatues=" + hasStatues +
                ", hasGarden=" + hasGarden +
                '}';
    }
}
