package com.company.HW8;

public class UserService implements General{


    public static void name(){
        System.out.println("Sasha");
    }

    public static void surname(User user){
        System.out.println("Tomalya");
    }

    public static void mail (User user){
        System.out.println("9876@gmail");
    }

    public static void age(String user){
        System.out.println("20");
    }

    public static void password(User user){
        System.out.println("qwe");
    }

    public static void role(User user){
        System.out.println("User");
    }
}
