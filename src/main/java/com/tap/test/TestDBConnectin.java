package com.tap.test;

import java.sql.Connection;
import com.tap.utility.DBConnection;

public class TestDBConnectin {

    public static void main(String[] args) {
        try (Connection con = DBConnection.getConnection()) {
            if (con != null) {
                System.out.println("Database Connected Successfully");
            } else {
                System.out.println("Database connection failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
