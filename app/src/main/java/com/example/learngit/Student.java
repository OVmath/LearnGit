package com.example.learngit;

import java.util.Date;
import java.util.Objects;

public class Student {
    private String studentID;
    private String fullName;
    private float gpa;
    private Date birthday;

    public Student(){

    }

    public Student(String studentID, String fullName, float gpa, Date birthday) {
        this.studentID = studentID;
        this.fullName = fullName;
        this.gpa = gpa;
        this.birthday = birthday;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentID, student.studentID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentID);
    }
}
