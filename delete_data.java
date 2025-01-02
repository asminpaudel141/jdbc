package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class delete_data {
    public static void main(String[] args){
        try {
            Connection conn=ConnectionProvider.getConnection();

            // write a query for delete data from the database.
            String que="delete from pasal where id=?";

            // make a prepared statement
            PreparedStatement pstmt=conn.prepareStatement(que);

            // Scanner input
            Scanner ap=new Scanner(System.in);

            System.out.println("enter the id");
            int id=ap.nextInt();
            pstmt.setInt(1,id);

            pstmt.executeUpdate();

            System.out.println("delete successfully");


        }catch (Exception e){
            System.out.println("error is :"+e);
        }
    }
}
