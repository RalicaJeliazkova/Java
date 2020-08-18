package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.printf("Enter first number: ");
        int n1 = input.nextInt();

        System.out.printf("Enter second number: ");
        int n2 = input.nextInt();

        System.out.printf("Hamming distance between numbers is: ");
        System.out.println(hammingDistance(n1,n2));

        System.out.print(n1 );
        System.out.printf("in binary: ");
        int binary[] = new int[40];
        int index = 0;
        while (n1 > 0) {
            binary[index++] = n1 % 2;
            n1 = n1 / 2;
        }
        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }



        System.out.printf("\n");
        System.out.print(n2 );
        System.out.printf("in binary: ");
        int binary1[] = new int[40];
        int index1=0;
        while (n2 > 0) {
            binary1[index1++] = n2 % 2;
            n2 = n2 / 2;
        }
        for (int i = index1 - 1; i >= 0; i--) {

            System.out.print(binary1[i]);
        }
    }


    static int hammingDistance(int n1, int n2) {
        int x = n1 ^ n2;
        int setBits = 0;

        while (x > 0) {
            setBits += x & 1;
            x >>= 1;
        }

        return setBits;
    }

}

