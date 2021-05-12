package com.company.HW8;

public class User {
    private String name;
    private String surname;
    private String mail;
    private String age;
    private String password;
    private String role = "User" ;

    public User(String name, String surname, String mail, String age,String password, String role) {
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.age = age;
        this.password = password;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
