package com.company;

public class Home_02 {

    public static void main(String[] args) {
        int N = 7;
        int mas[][] = new int[N][N];
        int num = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                mas[i][j] = (i + j + num);
                if (i > j) {
                    mas[i][j] = (i + j + num + 2 * (i - j));
                }
                if (j == 0 && i < N - 1 && i != 0) {
                    mas[i][j] = (3 * N) - ((i + j) % 2);
                }

                if (i == 1 && j < N - 1) {
                    mas[i][j] = ((i + j) + 3 * N);
                }
//                if(i == 2 && j <= N - 2){
//
//                }
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
