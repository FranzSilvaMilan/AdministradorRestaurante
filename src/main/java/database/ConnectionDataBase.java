/*
 * @(#)SearchConnection.java
 *
 * Copyright (c) 2018 Jala Foundation.
 * 2643 Av Melchor Perez de Olguin, Colquiri Sud, Cochabamba, Bolivia.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Jala Foundation, ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Jala Foundation.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * This class SearchConnection make connection to data base.
 *
 * @author Franz Silva.
 */
public class ConnectionDataBase {
    private static ConnectionDataBase connectionDataBase;
    private static Connection connection;

    private ConnectionDataBase() {
        init();
    }

    public static ConnectionDataBase getInstance() {
        if (connectionDataBase == null) {
            connectionDataBase = new ConnectionDataBase();
        }
        return connectionDataBase;
    }

    private void init() {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:restaurant.db");
            Statement state = null;
            state = connection.createStatement();
            state.execute("create table if not exists OrderRestaurant(id integer, pedidoJSON varchar(300), nombrePedido varchar(50), primary key(id));");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
