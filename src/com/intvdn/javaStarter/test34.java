package com.intvdn.javaStarter;
public class test34 {
    public static void main(String[] args) {
        int a = 4, b = 6, c = 5, d = 7;
        if ((a + b == c + d) ||(b + c == a + d) || (d + b == a + c)) {
            System.out.println("true");
        } else {
            System.out.println("false");
            //  այս բլոկը աշխատեց - (b + c == a + d)

        }
    }
}