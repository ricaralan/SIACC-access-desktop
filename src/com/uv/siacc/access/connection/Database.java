/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uv.siacc.access.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alan
 */
public class Database {
    
    private Connection connection = null;
    private String database;
    private String userDB;
    private String passwordDB;
    
    public Database(String host) {
        database = "db_siacc";
        userDB = "root";
        passwordDB = "RAOR940203";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://"+host+"/" + database, userDB, passwordDB);
            
            if(connection == null) {
                System.out.println("Connection error");
            } else {
               System.out.println("Connection successfull");
            }
            
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public Connection getConnection() {
        return connection;
    }
    
}
