package com.intvdn.javaStarter;

public class test35 {
    public static void main(String[] args) {
        int a = 4, b = 6, c = 5, d = 7;
        if ((a == b + c + d || b == a + c + d || c == a + b + d || d == a + b + c )) {
            System.out.println("true");
        }else {
            System.out.println("false");
            // ոչ մեկ հավասար չէ մյուս երեքի գումարին
        }
    }
}
