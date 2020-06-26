package com.company;

public class Coin {
    private final int HEADS = 0;
    private final int TAILS = 1;
    private int face;

    // Constructor... sets up the coin by flipping it initially
    public Coin() {
        flip();
    }

    // flips the coin by randomly choosing a face value
    public void flip() {
        face = (int) (Math.random() * 2);  //random numbers 0 or 1
    }

    // returns true if the current face of the coin is head

    public boolean isHeads() {
        return (face == HEADS);
    }

    // returns the current face of the coin as a string

    public String toString() {
        String faceName;
        if (face == HEADS) {
            faceName = "Heads";
        } else {
            faceName = "Tails";
        }
        return faceName;
    }
}
