import connection.MyDbConnection;

public class Main {
    public static void main(String[] args) {
        MyDbConnection db = new MyDbConnection();

        //db.inserDataToTable("Ana Dili");
        //db.updateDataIntoTable(7, "Azerbaycan Dili");
        db.deleteDataFromTable(2);

        db.getAllDataFromTable("select * from lessons");
    }
}
