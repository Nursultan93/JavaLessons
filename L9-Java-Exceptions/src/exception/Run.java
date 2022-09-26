package exception;

import java.io.IOException;
import java.sql.SQLException;

public class Run {
    public static void main(String[] args) {
        Run r = new Run();
        try {
            r.getData();
        }catch (SQLException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("sssssss");
        }
    }

    public void getData() throws SQLException, IOException{
        getConnection();
        System.out.println("Datalar geldi");
    }


    public void getConnection() throws SQLException, IOException, NullPointerException {
        System.out.println("Database ile elaqe yaradildi");
    }
}
