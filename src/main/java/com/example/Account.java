package com.example;

public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        return name.matches("(?=.{3,19}$)(\\S+\\s\\S+)");
    }
}
