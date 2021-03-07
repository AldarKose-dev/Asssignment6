package com.singleton;

class Database {
    private static Database instance;
    public static int counter=0;
    private Database() {
        counter ++;
    }

    public static Database getInstance() {
        if (Database.instance == null)
            instance = new Database();
        return Database.instance;
    }

    public String query (String sql){
        return "this method output all data from table";
    }

}

