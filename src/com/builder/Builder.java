package com.builder;

public interface Builder {
    void setWalls(String walls);
    void setWindows(int windows);
    void setDoors(int doors);
    void setRooms(int rooms);
    void setHasGarage(boolean hasGarage);
    void setHasSwimPool(boolean hasSwimPool);
    void setHasStatues(boolean hasStatues);
    void setHasGarden(boolean hasGarden);
}
