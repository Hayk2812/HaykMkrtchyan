package com.intvdn.javaStarter.Student;

import java.util.Scanner;

public class Student1 {
    public static void main(String[] args) {
        Student student = new Student();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.next();
        System.out.println("Enter your surname");
        String surname = scanner.next();
        System.out.println("enter your age");
        int age = scanner.nextInt();
        System.out.println("Enter your PHD");
        boolean isphd = scanner.next() == "Yes";
        System.out.println("enter your gender");
        char gender = scanner.next().charAt(0);
        System.out.println("Enter your mark");
        double mark = scanner.nextDouble();

        student.setName(name);
        student.setSurname(surname);
        student.setAge(age);
        student.setPHD(isphd);
        student.setGender(gender);
        student.setMark(mark);

        student.printInfo();
    }
}




