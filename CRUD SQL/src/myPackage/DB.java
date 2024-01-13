package myPackage;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    static Connection conn = null;
    public static Connection connect() {
        try {
            String url = "jdbc:mysql://localhost:3306/student";
            String username = "root";
            String password = "Aniruddh@123";

            conn = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
