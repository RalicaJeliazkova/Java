package com.company;

import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.RowConstraints;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String stringValue = "ABORT THE MISSION YOU HAVE BEEN SPOTTED";
        char cipherTextChars[] = stringValue.toCharArray();
        String text = new String(cipherTextChars);
        String add = "X";

        String chipherText = stringValue.replaceAll("\\s+", "");

        String encryptedString = "TIEIXTXXEAHSIHSPNTLT";
        char decrypt[] = encryptedString.toCharArray();
        String text2 = new String(decrypt);



        System.out.print("Enter a number for key for encryption ");
        int key = input.nextInt();

        System.out.print("Enter a number for key for decryption ");
        int keyD = input.nextInt();


        System.out.printf("Enter the route for decryption:\n" +
                "1: spiral from top left corner - counterclockwise\n" +
                "2: spiral from down right corner - clockwise\n");
        int route = input.nextInt();

        new encryption(key,chipherText,add);
        new decryption(keyD,  route, encryptedString);
    }

}

