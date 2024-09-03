package com.JDBc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc {
    public static void main(String args[]) {
        String url = "jdbc:mysql://localhost:3306/school1";
        String username = "root";
        String password = "Wordpad@11";
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO students (std_id, std_name) VALUES (69, 'Homelander')");
            stmt.executeUpdate("select *from students");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
