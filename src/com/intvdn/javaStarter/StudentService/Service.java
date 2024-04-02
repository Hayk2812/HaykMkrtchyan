package com.intvdn.javaStarter.StudentService;

import com.intvdn.javaStarter.Student.Student;

public class Service {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        Student s1 = service.create();
        System.out.println("***********");
        Student s2 = service.create();
        System.out.println("***************");
        Student s3 = service.create();
        Student[] student = {s1,s2,s3};

        Student[] smallestGirl = new Student[]{service.smallestGirl(student)};

        for (Student student1 : smallestGirl){
            student1.printInfo();
            System.out.println();
        }

        }
    }
