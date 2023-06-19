package com.example.learngit;

public class Test {
    private int age;
    private String fullName;
    private String address;

    public Test(int age) {
        this.age = age;
    }

    public Test(int age, String fullName, String address) {
        this.age = age;
        this.fullName = fullName;
        this.address = address;
    }
}
