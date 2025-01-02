package jdbc;
import java.sql.*;

public class demo {
    public static void main(String[] args) throws Exception
    {
        String url="jdbc:mysql://127.0.0.1:3306/mydb";
        String uname="root";
        String pass= "asmin123";


        Class.forName("com.mysql.cj.jdbc.Driver"); // for driver load     com.mysql.cj.jdbc.Driver
        Connection con = DriverManager.getConnection(url,uname,pass);
        Statement statement = con.createStatement();

        // for data insert in to the database table
//        String query1=String.format("Insert into students(name,age,marks) Values('%s',%o,%f)", "nikesh",25,88.85);
//        int row_affected=statement.executeUpdate(query1);
//
//        // if insert than data
//        if (row_affected>0){
//            System.out.println("data inserted successfully!");
//        }else {
//            System.out.println("fail inserted data");
//        }


        // for data update in database
//        String query2=String.format("UPDATE students SET marks= %f WHERE id=%d",89.85,2);
//        int row_affected1=statement.executeUpdate(query2);
//
//        if (row_affected1>0){
//            System.out.println("data update successfully ");
//        }else {
//            System.out.println("failed ");
//        }

        // delete the date from database
    String query3="DELETE from students WHERE id=3";

    int row_affected2=statement.executeUpdate(query3);
    if (row_affected2>0){
        System.out.println("the data delete successfully");
    }else {
        System.out.println("failed the delete the data");
    }


//        String query= "select * from students";
//
//        ResultSet resultSet=statement.executeQuery(query);
//
//        while (resultSet.next()){
//            int id=resultSet.getInt("id");
//            String name=resultSet.getString("name");
//            int age=resultSet.getInt("age");
//            double marks=resultSet.getDouble("marks");
//
//            System.out.println("id: "+id);
//            System.out.println("name :"+name);
//            System.out.println("age"+age);
//            System.out.println("marks"+marks);
//        }
        // using preparedStatement
        String query = "INSERT INTO students(name, age, marks) VALUES(?, ?, ?)";
    PreparedStatement preparedStatement=con.prepareStatement(query);
    preparedStatement.setString(1,"tilak");
    preparedStatement.setInt(2,21);
    preparedStatement.setDouble(3,98.56);
    int row_affected3=preparedStatement.executeUpdate();
    if (row_affected3>0){
        System.out.println("insert the date successfully ");
    }else {
        System.out.println("not insert the date failed ");
    }
    }
}
