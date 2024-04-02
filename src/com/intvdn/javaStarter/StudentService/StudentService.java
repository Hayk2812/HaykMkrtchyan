package com.intvdn.javaStarter.StudentService;

import com.intvdn.javaStarter.Student.Student;

import java.util.Scanner;

public class StudentService {
    Student student = new Student();
    Scanner scanner = new Scanner(System.in);

    public Student create() {
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
        student.setGender(gender);
        student.setMark(mark);
        student.setPHD(isphd);
        return student;
    }

    public Student smallestGirl(Student[] students) {
        Student mingirl = null;
        for (Student student1 : students) {
            if (student1.getGender() == 'F') {
                mingirl = student1;
            } else if (mingirl.getGender() == 'F' && student1.getAge() > mingirl.getAge()) {
                mingirl = student1;

                if (mingirl != null) {
                    mingirl.printInfo();
                } else {
                    System.out.println();
                }
            }
        }
        return student;
    }

}
