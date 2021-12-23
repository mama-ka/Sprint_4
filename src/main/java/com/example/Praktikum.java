package com.example;

public class Praktikum {
    static String fullName = "яна";

    public static void main(String[] args) {

        Account account = new Account(fullName);
        account.checkNameToEmboss();
        System.out.println(account.checkNameToEmboss());
    }
}
