package com.company;

public class Home_02 {

    public static void main(String[] args) {
        int N = 5;
        int mas[][] = new int[N][N];
        int num = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                mas[i][j] = (i + j + num);
                if (i > j) {
                    mas[i][j] = (i + j + num + 2 * (i - j));
                }
                if (i != 0 && j == 0) {
                    mas[i][j] = (i + j + num + 2 * (i - j));
                }
            }
        }

        System.out.println();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.printf("%-5d", mas[i][j]);
            }
            System.out.println();
        }

    }
}
