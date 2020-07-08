package f71917.test1.game;

import java.util.List;
import java.util.Random;

public class DeckOfCards {

    private Card[] cards;
    private int currentCard;
    private Card[] hand;

    public DeckOfCards() {
        this.cards = new Card[52];
        this.currentCard = 0;
        this.hand = new Card[5];

        shuffleCards();
    }

    public void shuffleCards() {
        this.currentCard = 0;
        for (int i = 0; i < 100; i++) {
            this.shuffle();
        }
    }

    public void dealFive() {

        int currentIndex = this.currentCard;
        for (int i = 0; i < 5; i++) {
            if (currentIndex >= this.cards.length) {
                return;
            }
            hand[i] = this.cards[currentIndex];
            currentIndex++;
        }
    }

    public String countHand(Countable choice) {
        return choice.count(this.hand);
    }

    private void shuffle() {
        Random random = new Random();
        int index1 = random.nextInt(52);
        int index2 = random.nextInt(52);
        Card card1 = this.cards[index1];
        Card card2 = this.cards[index2];
        this.cards[index1] = card2;
        this.cards[index2] = card1;
    }

}
