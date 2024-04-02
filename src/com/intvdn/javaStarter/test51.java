package com.intvdn.javaStarter;

public class test51 {
    public static void main(String[] args) {
       boolean t;
        int x = 789;
        int units = x % 10;
        int tens = x % 10 / 10;
        int hundreds = x / 100;
        if (units == tens + hundreds) {
            System.out.println(t = true);
        }else {
            System.out.println(t = false);
        }
    }
}
