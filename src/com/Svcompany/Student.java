package com.Svcompany;

/**
 * Created by Svetik on 18.07.2016.
 */
public class Student extends Person {
    private String IdNumber;
    private double gpa;


    public Student(String name, int age, String gender, String IdNumber, double gpa) {
        super(name, age, gender);
        this.IdNumber = IdNumber;
        this.gpa = gpa;
    }

    public String getIdNumber() {
        return IdNumber;
    }

    public void setIdNumber(String idNumber) {
        IdNumber = idNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString()+ ", student id: " + IdNumber + ", gpa: " + gpa;
    }
}
