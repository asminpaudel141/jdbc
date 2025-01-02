package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
    private static Connection conn;

    public static Connection getConnection(){
        try {
            if (conn==null){
                Class.forName("com.mysql.cj.jdbc.Driver");

                conn = DriverManager.getConnection("jdbc:mysql://localhost:3310/business","root","asmin123");
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return conn;
    }
}
