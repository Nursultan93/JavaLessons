package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDbConnection {

    private  Connection connection;
    private  ResultSet resultSet;
    private  Statement statement;
    private PreparedStatement preparedStatement;

    private void connectDb(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_spring_security", "root", "root");
            statement = connection.createStatement();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void getAllDataFromTable(String query) {
        connectDb();

        try {
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()){
                System.out.println("Id= "+rs.getString("id") + " Ders Adi: "+ rs.getString("name"));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }

    }


    public void inserDataToTable(String lessonName){
        connectDb();

        try {

            preparedStatement = connection.prepareStatement("insert into lessons (id, name) values (?, ?)");
            preparedStatement.setString(1, null);
            preparedStatement.setString(2, lessonName);

            preparedStatement.executeUpdate();


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void updateDataIntoTable(int id, String newLessonName){
        connectDb();

        try {

            preparedStatement = connection.prepareStatement("update lessons set name = ? where id = ?");
            preparedStatement.setString(1, newLessonName);
            preparedStatement.setInt(2, id);

            preparedStatement.executeUpdate();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void deleteDataFromTable(int id){
        connectDb();

        try {
            preparedStatement = connection.prepareStatement("delete from lessons where id=?");
            preparedStatement.setInt(1, id);

            preparedStatement.executeUpdate();


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
