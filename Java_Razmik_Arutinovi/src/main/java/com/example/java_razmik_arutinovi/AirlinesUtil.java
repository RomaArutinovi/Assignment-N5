package com.example.java_razmik_arutinovi;

import java.sql.SQLException;

public class AirlinesUtil {

    private AirlinesUtil() {}

    public static void createTable() {

        String createSql = "CREATE TABLE AIRLINES (" +
                "DIRECTION VARCHAR(255)," +
                "DATE VARCHAR(255)," +
                "PLACES INTEGER NOT NULL," +
                "PRICE INTEGER NOT NULL)";

        try {
            JDBCUtil.getStatement().executeUpdate(createSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Created table in given database...");
    }

    public static void insert(Airlines airlines) {

        String insertSql = "INSERT INTO AIRLINES(DIRECTION, DATE, PLACES, PRICE) VALUES(" +
                "'"+ airlines.getDirection() + "', " +
                "'"+ airlines.getDate() + "', " +
                ""+ airlines.getPlaces() + "" +
                ""+ airlines.getPrice() + ")";

        try {
            JDBCUtil.getStatement().executeUpdate(insertSql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Inserted...");
    }

}