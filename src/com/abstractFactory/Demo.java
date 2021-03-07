package com.abstractFactory;

import java.util.Scanner;

public class Demo {

    static FurnitureFactory factory;
    private static Application configureFurniture(int input) {
        if(input == 1)
            factory = new ModernFurnitureFactory();
        else
            factory = new VictorianFurnitureFactory();

        Application app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        System.out.println("Which type of furniture you want to create: ");
        System.out.println("1-modern 2-victorian");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        Application app = configureFurniture(input);
        app.output();
    }
}
