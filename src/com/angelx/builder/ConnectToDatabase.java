package com.angelx.builder;

import java.sql.*;

public class ConnectToDatabase {
    public static final String URL = "jdbc:mysql://localhost:3307/coctails?autoReconnect=true&useSSL=false";
    public static final String USERNAME = "Alexandr123";
    public static final String PASSWORD = "qwerty111";

    protected Connection connection;

    public ConnectToDatabase() {
        try{
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch(SQLException e){
            e.printStackTrace();
        }

    }
}
