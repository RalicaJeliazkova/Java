package com;

import cards.Card;
import cards.FaceOfCards;
import cards.SuitOfCards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class DeckOfCards {
    private ArrayList<Card> cards;
    private int currentCard;

    public DeckOfCards() {
        currentCard = 0;

        cards = new ArrayList<>(52);

        for (SuitOfCards s : SuitOfCards.values()) {
            for (FaceOfCards f : FaceOfCards.values()) {
                cards.add(new Card(f, s));
            }
        }
    }

    public void shuffleCards() {
        int[] newPositions;
        Random random;
        boolean isPresent;

        currentCard = 0;
        newPositions = new int[52];
        random = new Random();
        int candidatePosition;

        for (int i = 0; i < 52; i++) {

            do {
                candidatePosition = random.nextInt(52);
                isPresent = false;

                for (int j = 0; j < i; j++) {
                    if (newPositions[j] == candidatePosition) {
                        isPresent = true;
                        break;
                    }
                }
            } while (isPresent);
            newPositions[i] = candidatePosition;
        }
        for (int i = 0; i < 52; i++) {
            Card temp = cards.get(i);
            cards.set(i, cards.get(newPositions[i]));
            cards.set(newPositions[i], temp); // safe 0 index
        }

    }

    public Card[] dealFive() {
        Card[] result = new Card[5];

        for (int i = 0; i < 5; i++) {
            if (currentCard == 52) {
                break;
            }
            result[i] = cards.get(currentCard);
            ++currentCard;

        }
        return result;
    }

    public void sortByFaceCards() {
        ArrayList<FaceOfCards> powers = new ArrayList<FaceOfCards>(Arrays.asList(FaceOfCards.values()));

        int size = cards.size();

        for (int i = 0; i < size; i++) {
            int miniIntex = 1;

            for (int j = i + 1; j < size; j++) {
                if (powers.indexOf(powers.get(j)) < powers.indexOf(powers.get(miniIntex))) {
                    miniIntex = j;
                }
            }
            if (miniIntex != i) {
                Card temp = cards.get(i);
                cards.set(i, cards.get(miniIntex));
                cards.set(miniIntex, temp);
            }
        }
    }

    public void printBySuits() {
        ArrayList<Card> result = new ArrayList<>(52);

        for (SuitOfCards s : SuitOfCards.values()) {
            System.out.println(s);

            for (int i = currentCard; i < 52; i++) {
                Card temp = cards.get(i);
                if (temp.getSuit().equals(s)) {
                    result.add(new Card(cards.get(i).getFace(), s));
                }
            }
            System.out.printf("%s: %s\n", s, result);
            result.clear();
        }
    }

    public ArrayList<FaceOfCards> getDistinctFaces() {
        ArrayList<FaceOfCards> result = new ArrayList<FaceOfCards>(52);
        for (int i = currentCard; i < 52; i++) {
            result.add(cards.get(i).getFace());
        }

        return result;
        //Return only the unique face;

    }


    public static void main(String[] args) {

        DeckOfCards deckOfCards = new DeckOfCards();

        System.out.println("Testing");
        deckOfCards.printBySuits();



        System.out.println("Test shuffle");
        deckOfCards.shuffleCards();
        for (int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(deckOfCards.dealFive()));
        }

        System.out.println("Test distinct faces");
        System.out.println(deckOfCards.getDistinctFaces());
    }
}