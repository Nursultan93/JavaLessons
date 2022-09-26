package examples;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Register register = new Register();

        System.out.println("Qeydiyyatdan kec!");
        System.out.print("Adiniz: ");
        String ad = sc.nextLine();   // && ||




        if (ad == null || ad.trim().isEmpty()){
            throw new NameAndSurnameNotNull("Ad ve ya Soyad bos ola bilmez!");
        }

        register.setName(ad);

        System.out.print("Soyadiniz : ");
        String soyad = sc.nextLine();

        if (soyad == null || soyad.trim().isEmpty()){
            throw new NameAndSurnameNotNull("Ad ve ya Soyad bos ola bilmez!");
        }

        register.setSurname(soyad);

        System.out.print("Email: ");
        String email = sc.nextLine();

        if (!email.contains("@")){
            throw new InvalidEmailException("Kecerli email daxil edin!");
        }

        register.setEmail(email);

        System.out.print("Parol: ");
        String parol = sc.nextLine();

        if (soyad == null || ad.trim().isEmpty()){
            throw new NameAndSurnameNotNull("Parol bos ola bilmez!");
        }

        register.setPassword(parol);

        System.out.println(register);

    }
}
