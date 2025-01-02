package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class create_table {
    public static void main(String[] args){
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

            // create a query
            String que="CREATE TABLE pasal(id INT primary key, name varchar(20), age INT);";

            // create a statement
           Statement ste= conn.createStatement();
           ste.executeUpdate(que);
           System.out.println("your table is create ");

        }catch (Exception e){
            System.out.println("error is "+e);
        }
}
}
