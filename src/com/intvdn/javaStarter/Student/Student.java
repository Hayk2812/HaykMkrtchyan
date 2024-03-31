package com.intvdn.javaStarter.Student;

public class Student {
    private String name;
    private String surname;
    private int age;
    private boolean isPHD;
    private char gender;
    private double mark;


    public Student() {

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isPHD() {
        return isPHD;
    }

    public void setPHD(boolean PHD) {
        this.isPHD = PHD;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;

    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {

        this.mark = mark;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Is PHD; " + (isPHD == true ? "Yes" : "No"));
        System.out.println("Gender: " + (gender == 'M' ? "Male" : "Female"));
        System.out.println("Mark: " + mark);


    }
}






