package exception;

import exception.custom.EmployeeNotFoundException;

import java.sql.SQLException;

public class Main {

    Integer yas = 30;

    public static void getData() {

            Employee emp = Database.getEmployeeFromDatabase();

            if (emp == null){
                throw new EmployeeNotFoundException("Bu isci bazamizda yoxdur");
            }

            var a = emp.name;

    }

    public static void main(String[] args) {
        System.out.println("birinci emeliyyat");
        Database db = new Database();
        try {

            db.openDbConnection();

           getData();

           int data = 50/3;

           int [] arr = new int[3];

           int deyer = arr[2];

           String str = "sss";

           int deyer2 = Integer.parseInt(str);


        }catch (NullPointerException e) {
            System.out.println("Null Pointer exception");
        }catch (ArithmeticException e){
            System.out.println("Artimetik exception");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index of bounds");
        }catch (EmployeeNotFoundException e){
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("Exception");
        } finally {
            db.closeDbConnection();
            System.out.println("finally blok");
        }

        System.out.println("Ucuncu emeliyyat");

    }
}
