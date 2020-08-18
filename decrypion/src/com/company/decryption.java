package com.company;

public class decryption {


    decryption(int keyD, int route, String encryptedString) {

        if (keyD < 0) {

            keyD *= -1;
        }

        int k = 0;
        int row = (encryptedString.length() / keyD);
        int saveRow = row;
        int column = keyD;
        int currentR = 0, currentC = 0, counter = 0;
        int total = row * column;

        char s[][] = new char[row][column];


        while (row - 1 >= currentR && column - 1 >= currentC) {
            if (counter == total) {
                break;
            }
            for (int i = row - 1; i >= currentR; i--) {
                s[i][column - 1] = encryptedString.charAt(counter);
                counter++;
            }
            row--;
            if (counter == total) {
                break;
            }
            for (int j = column - 2; j >= currentC; j--) {
                s[currentR][j] = encryptedString.charAt(counter);
                counter++;
            }
            currentR++;
            if (counter == total) {
                break;
            }
            if (currentR <= row) {
                for (int i = currentR; i <= row; i++) {
                    s[i][currentC] = encryptedString.charAt(counter);
                    counter++;
                    ;
                }
                column--;
            }
            if (counter == total) {
                break;
            }
            if (currentC < column) {
                for (int j = currentC + 1; j < column; j++) {
                    s[row][j] = encryptedString.charAt(counter);
                    counter++;
                }
                currentC++;
            }
        }

        //Printing the Spiral
        System.out.println("\nThe Spiral pattern is : ");
        if (route == 1) {
            for (int i = saveRow - 1; i >= 0; i--) {
                for (int j = keyD - 1; j >= 0; j--) {
                    System.out.print(s[i][j] + "\t");
                }
                System.out.println("");
            }

            System.out.printf("the real text is: ");


            for (int i = saveRow - 1; i >= 0; i--) {
                for (int j = keyD - 1; j >= 0; j--) {
                    System.out.print(s[i][j]);
                }
            }
        }
        if (route == 2) {

            for (int i = 0; i < saveRow; i++) {
                for (int j = 0; j < keyD; j++) {
                    System.out.print(s[i][j] + "\t");
                }
                System.out.println("");
            }

            System.out.printf("the real text is: ");

            System.out.printf("the real text is: ");
            for (int i = saveRow - 1; i >= 0; i--) {
                for (int j = keyD - 1; j >= 0; j--) {
                    System.out.print(s[i][j]);
                }
            }
        }
    }
}


