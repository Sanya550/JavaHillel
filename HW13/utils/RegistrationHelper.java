package com.company.HW13.utils;

import java.util.Scanner;

public class RegistrationHelper {
    //phone:
    public static void phone() {

        while (true) {
            Scanner s1 = new Scanner(System.in);
            System.out.println("Enter your phone, which have to start from +380.. and consist in general one '+' and 12 numbers: ");
            String phone = s1.next();
            boolean result1 = phone.matches("(\\+380)\\d{9}");

            if (result1) {
                System.out.println("Perfect.");
                break;
            } else {
                System.out.println("Error.Try again");
            }
        }
    }

    //mail:
    public static void mail() {
        while (true) {
            Scanner s2 = new Scanner(System.in);
            System.out.println("Enter your email, which have to end on @ukr.net: ");
            String mail = s2.next();
            boolean result2 = mail.matches("\\w*\\@ukr.net$");

            if (result2) {
                System.out.println("Perfect");
                break;
            } else {
                System.out.println("Error.Try again");
            }
        }
    }

    //date of birthday
    public static void birthday() {
        while (true) {
            Scanner s3 = new Scanner(System.in);
            System.out.println("Enter your date of birthday, which have to consist 6 numbers and 2 dots(for example: 01.15.2001):  ");
            String birthday = s3.next();
            boolean result3 = birthday.matches("\\d{2}.\\d{2}.\\d{4}");
            if (result3) {
                System.out.println("Perfect");
                break;
            } else {
                System.out.println("Error.Try again");
            }
        }
    }
}
