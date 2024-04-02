package com.intvdn.javaStarter;

public class arraytnayin {
    public static void main(String[] args) {
        int[] array = {45, 679, 457, 214, 698};
        int[] resualtArray = new int[array.length];
        int x = 45;
        int resualt = 0;

        while (x != 0) {
            resualt = resualt * 10 + x % 10;
            x = x / 10;
        }
        System.out.println(resualt);

        int i = 679;
        int sum = 0;
        while (i != 0) {
            sum = sum * 10 + i % 10;
            i = i / 10;
        }
        System.out.println(sum);

        int a = 457;
        int numbers = 0;
        while (a != 0) {
            numbers = numbers * 10 + a % 10;
            a = a / 10;
        }
        System.out.println(numbers);

        int b = 214;
        int temp = 0;
        while (b != 0) {
            temp = temp * 10 + b % 10;
           b = b / 10;
        }
        System.out.println(temp);

        int c = 698;
        int name = 0;
        while (c != 0) {
            name = name * 10 + c % 10;
           c = c / 10;
        }
        System.out.println(name);

    }
}