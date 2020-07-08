package f71917.test1.game;

public class Card {

    private Faces face;
    private Suits suit;

    public Card(Faces face, Suits suit) {
        this.face = face;
        this.suit = suit;
    }

    public Faces getFace() {
        return this.face;
    }

    public Suits getSuit() {
        return this.suit;
    }

    public void setFace(Faces face) {
        this.face = face;
    }

    public void setSuit(Suits suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return this.face + " of " + this.suit;
    }
}
