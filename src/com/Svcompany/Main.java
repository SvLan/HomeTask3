package com.Svcompany;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Coach Bob", 27, "M");
        Student st1 = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        Teacher teach1 = new Teacher("Duke Java", 34, "M", "Computer Science", 50000.0);
        CollegeStudent colst1 = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");

        Person[] arrayPersons = {p1, st1, teach1, colst1};

        for (Person person : arrayPersons) {
            System.out.println(person.toString());
        }
    }
}