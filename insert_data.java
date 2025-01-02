package jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class insert_data {
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

            // insert the data into a database
            String query=String.format("insert into pasal(id,name,age) values('%o','%s','%o')",1,"ram",19);
            String query1="insert into pasal(id,name,age) values(?,?,?)";

            // create statement
            Statement sta=conn.createStatement();
            //int row_affected= sta.executeUpdate(query);

            // prepared statement object
            PreparedStatement prt=conn.prepareStatement(query1);

            //take input form bufferedReader
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the id: ");
            String id= br.readLine();

            System.out.println("Enter name:");
            String name=br.readLine();

            System.out.println("Enter the age");
            String age=br.readLine();



            prt.setString(1,id);
            prt.setString(2,name);
            prt.setString(3,age);

            prt.executeUpdate();
            System.out.println("data inserted successfully");

            // if insert than data
//            if (row_affected>0){
//                System.out.println("data insert successfully");
//            }else {
//                System.out.println("error ");
//            }

        }catch (Exception e){
            System.out.println("error is "+e);
        }
    }
}
