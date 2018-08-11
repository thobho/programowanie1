package com.sdacademy.day6;

import java.util.Arrays;

public class MultiDimArrays {

    public static void main(String args[]){
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        printArray(arr);

        int[][][]  tablica = new int[3][3][3];



//        int[] ints = sumRows(arr);
  //      System.out.println(ints[0]);
    }

    public static double[][] transposeMatrix(double [][] m){
        double[][] temp = new double[m[0].length][m.length];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                temp[j][i] = m[i][j];
        return temp;
    }

    private static double[][] sumMatrices(double[][] firstMatrix, double[][] secondMatrix){
        //sprawdzić, czy takie same rozmiary
        double[][] sum = new double[firstMatrix.length][firstMatrix[0].length];
        for(int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < secondMatrix.length; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        return sum;
    }

    private static int[] sumRows(int[][] arr){

        int[] result = new int[arr.length];
        Arrays.fill(result, 0);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[i] += arr[i][j];
            }
        }

        return result;
    }


    static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println("\n");
        }
    }


}
