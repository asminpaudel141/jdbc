package jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class update_data {
    public static void main(String[] args){
        try {
            Connection conn=ConnectionProvider.getConnection();

            String e="update pasal set name=?, age=? where id=?";

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter new name");
            String name=br.readLine();

            System.out.println("enter the age");
            int age=Integer.parseInt(br.readLine());

            System.out.println("enter the id");
            int id=Integer.parseInt(br.readLine());

            PreparedStatement pstmt=conn.prepareStatement(e);

            pstmt.setString(1,name);
            pstmt.setInt(2,age);
            pstmt.setInt(3,id);

            pstmt.executeUpdate();

            System.out.println("done.......");
            conn.close();






        }catch (Exception e){
            System.out.println(e);
        }
    }
}
