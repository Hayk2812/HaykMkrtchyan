package com.intvdn.javaStarter;

public class matrix2 {
    public static void main(String[] args) {
        int matrix [][] = {{4,5,9,7},
                           {8,8,7,4},
                           {7,1,2,3},
                           {9,7,8,5} };
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j <matrix.length ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        }
    }

