package com.uycode;

import java.util.Scanner;

public class ArrayPiramida {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int num[][] = {{1, 0, 0},{4, 8, 0}, {1, 5, 3}};
        int nums[][] = new int[3][3];

        int result = maxValue(num,2, 2);
        System.out.println(result);


    }

    static int maxValue(int num[][], int m, int n) {

        for(int i = m -1; i >= 0; i--) {
            for(int j = 0; j <= i; j++) {
                if(num[i + 1][j] > num[i + 1][j + 1]) {
                    num[i][j] += num[i + 1][j];
                }else {
                    num[i][j] += num[i + 1][j + 1];
                }
            }
        }
        return num[0][0];
    }
}
