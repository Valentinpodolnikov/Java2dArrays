package com.company;

public class Main {

    public static void main(String[] args) {
        int N = 5;
        int mas[][] = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i >= j) {
                    mas[i][j] = 1;
                } else {
                    mas[i][j] = 0;
                }
            }
        }
        System.out.println();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%-2d", mas[i][j]);
            }
            System.out.println();
        }

    }
}
