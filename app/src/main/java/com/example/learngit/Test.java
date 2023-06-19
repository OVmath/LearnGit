package com.example.learngit;

public class Test {
    private int age;
    private String fullName;
    private String job;
    private String address;

    public Test(int age) {
        this.age = age;
    }

    public Test(int age, String fullName, String address) {
        this.age = age;
        this.fullName = fullName;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Test{" +
                "age=" + age +
                ", fullName='" + fullName + '\'' +
                ", job='" + job + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
