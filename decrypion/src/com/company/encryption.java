package com.company;

public class encryption {
    encryption(int key, String chipherText, String add) {
        if (key > 0) {
            int k = 0;
            int row = (chipherText.length() / key) + 1;
            int column = key;


            char s[][] = new char[row][column];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    if (k < chipherText.length())
                        if (row * column != chipherText.length()) {
                            chipherText += add;
                        }
                    s[i][j] = chipherText.charAt(k);
                    k++;
                }
            }

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    if (s[i][j] == 0) {
                        break;
                    }
                    System.out.print(s[i][j] + "\t");
                }
                System.out.println("");
            }

            int startR = 0, startC = 0, counter = 0, i;
            int total = row * column;

            System.out.printf("If the key is positive: ");

            while (startR < row && startC < column) {
                if (counter == total) {
                    break;
                }
                for (i = startR; i < row; i++) {
                    System.out.print(s[i][startC]);
                    counter++;
                }
                startC++;

                if (counter == total) {
                    break;
                }
                for (i = startC; i < column; i++) {
                    System.out.print(s[row - 1][i]);
                    counter++;
                }
                row--;
                if (counter == total) {
                    break;
                }
                if (startR < row) {
                    for (i = row - 1; i >= startR; i--) {
                        System.out.print(s[i][column - 1]);
                        counter++;
                    }
                    column--;
                }

                if (counter == total) {
                    break;
                }
                if (startC < column) {
                    for (i = column - 1; i >= startC; i--) {
                        System.out.print(s[startR][i]);
                        counter++;
                    }
                    startR++;
                }
            }
        }
        if (key < 0) {
            key *= -1;
            int k = 0;
            int row = (chipherText.length() / key) + 1;
            int column = key;


            char s[][] = new char[row][column];


            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    if (k < chipherText.length())
                        if (row * column != chipherText.length()) {
                            chipherText += add;
                        }
                    s[i][j] = chipherText.charAt(k);
                    k++;
                }
            }

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    if (s[i][j] == 0) {
                        break;
                    }
                    System.out.print(s[i][j]);
                }
                System.out.println("");
            }

            int endR = 0, endC = 0, counter = 0, i;
            int total = row * column;

            System.out.printf("If the key is negative: ");

            while (row - 1 >= endR && column - 1 >= endC) {
                if (counter == total) {
                    break;
                }
                for (i = row - 1; i >= endR; i--) {
                    System.out.print(s[i][column - 1]);
                    counter++;
                }
                row--;
                if (counter == total) {
                    break;
                }
                for (i = column - 2; i >= endC; i--) {
                    System.out.print(s[endR][i]);
                    counter++;
                }
                endR++;
                if (counter == total) {
                    break;
                }
                if (endR <= row) {
                    for (i = endR; i <= row; i++) {
                        System.out.print(s[i][endC]);
                        counter++;
                        ;
                    }
                    column--;
                }
                if (counter == total) {
                    break;
                }
                if (endC < column) {
                    for (i = endC + 1; i < column; i++) {
                        System.out.print(s[row][i]);
                        counter++;
                    }
                    endC++;
                }
            }
        }
    }
}

