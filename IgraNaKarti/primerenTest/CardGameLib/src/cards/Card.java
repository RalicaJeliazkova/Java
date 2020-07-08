package cards;

public class Card {
    private FaceOfCards face;
    private SuitOfCards suit;

    public Card (FaceOfCards face, SuitOfCards suit){
        setFace(face);
        setSuit(suit);
    }

    public FaceOfCards getFace() {
        return face;
    }

    public void setFace(FaceOfCards face) {
        this.face = face;
    }

    public SuitOfCards getSuit() {
        return suit;
    }

    public void setSuit(SuitOfCards suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return String.format("%s of %s", face.getValue(),suit.getValue());
    }
}
