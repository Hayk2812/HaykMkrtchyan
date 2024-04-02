package com.intvdn.javaStarter;

public class test25 {
    public static void main(String[] args) {
        int a = 4, b = 6, c = 5;
        if (a + b >= c && b + c >= a && a + c >= b) {
            System.out.println("y = 1 ");
        } else {
            System.out.println("y = 2 ");
            // առաջին բլոկը ճիշտ է
        }
    }
}
