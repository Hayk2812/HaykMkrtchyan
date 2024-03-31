package com.intvdn.javaStarter.StudentService;

import com.intvdn.javaStarter.Student.Student;

public class Service {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        Student s1 = service.create();
        Student s2 = service.create();
        Student s3 = service.create();

        s1.setName("Anna");
        s1.setAge(25);
        System.out.println("*********");

        s2.setName("Ani");
        s2.setAge(21);
        System.out.println("*********");

        s3.setName("Mari");
        s3.setAge(26);

        for (int i = 0; i < ; i++) {

        }
    }
}
