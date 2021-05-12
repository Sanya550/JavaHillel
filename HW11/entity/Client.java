package com.company.HW11.entity;

public class Client {

    private String identifierOfClient;
    private String Surname;
    private String identifierOfAccount;
    private double summary;

    public Client(String identifierOfClient, String surname, String identifierOfAccount, double summary) {
        this.identifierOfClient = identifierOfClient;
        Surname = surname;
        this.identifierOfAccount = identifierOfAccount;
        this.summary = summary;
    }

    public Client() {

    }

    public String getIdentifierOfClient() {
        return identifierOfClient;
    }

    public void setIdentifierOfClient(String identifierOfClient) {
        this.identifierOfClient = identifierOfClient;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getIdentifierOfAccount() {
        return identifierOfAccount;
    }

    public void setIdentifierOfAccount(String identifierOfAccount) {
        this.identifierOfAccount = identifierOfAccount;
    }

    public double getSummary() {
        return summary;
    }

    public void setSummary(double summary) {
        this.summary = summary;
    }


}
