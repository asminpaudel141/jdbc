package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLOutput;

public class JDBCDemo {
    public static void main(String[] args){
        System.out.println("hello Welcome");
        getConnection();
    }
    public static Connection getConnection(){
        try{
            String driver="com.mysql.cj.jdbc.Driver";
            String databaseUrl="jdbc:mysql://localhost:3310/business";
            String username="root";
            String password="asmin123";

            // load driver class
            Class.forName(driver);

            // connect database thought driver manager
            Connection conn= DriverManager.getConnection(databaseUrl,username,password);
            System.out.println("your database is connect ");
            return conn;

        }catch (Exception e){
            System.out.println("error is "+e);
        }
        return null;
    }
}
