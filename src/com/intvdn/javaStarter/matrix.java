package com.intvdn.javaStarter;

public class matrix {
    public static void main(String[] args) {
        int matrix [] [] = { {2,5,4,5,},
                             {7,8,5,6,},
                             {4,6,7,8},
                             {7,6,4,7}  };
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length ; j++) {
                System.out.print(matrix[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println(matrix[2][0]);
    }
}
