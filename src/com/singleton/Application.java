package com.singleton;

class Application {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query("SELECT * FROM TABLE");

    }
}