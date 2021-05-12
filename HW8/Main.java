package com.company.HW8;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import static com.company.HW8.User.*;
import static java.lang.System.exit;

public class Main {


    public static void main(String[] args) throws IOException {
        Admin admin = new Admin("Alex","Pyvovar", "12345@gmail","18","zxc","Admin");
User user = new User("Sasha","Tomalya","20","9876@gmail","qwe","User");

        Scanner UorA = new Scanner(System.in);
        System.out.println("Enter 1, if you are User, and 2 if you are Admin: ");
        int q1 = UorA.nextInt();

        if(q1==1){
            Scanner UserMail = new Scanner(System.in);
            System.out.println("Enter your mail: ");
            String User11 = UserMail.next();

            Scanner UserPassword = new Scanner(System.in);
            System.out.println("Enter your password: ");
            String User22 = UserPassword.next();

            if (User11 == "9876@gmail") {
                if(User22 == "qwe"){
                    System.out.println("You are really user and it is your data: ");
                    System.out.println(user.getName());
                    System.out.println(user.getSurname());
                    System.out.println(user.getAge());
                    exit(1);
                }else{
                    System.out.println("Error");
                }
            }else{
                System.out.println("Error");
            }
        if(q1 == 2){
          Scanner AdminMail = new Scanner(System.in);
          System.out.println("Enter your mail: ");
          String Admin1 = AdminMail.next();

          Scanner AdminPassword = new Scanner(System.in);
          System.out.println("Enter your password: ");
           String Admin2 = AdminPassword.next();
            if (Admin1 == "12345@gmail") {
        if(Admin2 == "zxc"){
            System.out.println("You are really admin and it is your data: ");
            System.out.println(admin.getName());
            System.out.println(admin.getSurname());
            System.out.println(admin.getAge());
        }else{
            System.out.println("Error");
        }
    }else{
        System.out.println("Error");
    }
}

        }


    }
}
