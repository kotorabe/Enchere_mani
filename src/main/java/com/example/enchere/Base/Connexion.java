package com.example.enchere.Base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {
	private static String url = "jdbc:postgresql://containers-us-west-185.railway.app:5889/railway";
    private static String user="postgres";
    private static String passwd = "NxPX0hpksmxrlYaTnqg5";
	private static Connection connect;
	public static Connection setConnect() throws SQLException {
		if (connect == null) {
            try {
                connect = DriverManager.getConnection(url, user, passwd);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connect;
	}
}
