package f71917.test1.game;

public enum Faces {
    ACE("Ace"),
    DEUCE("Deuce"),
    THREE("Three"),
    FOUR("Four"),
    FIVE("Five"),
    SIX("Six"),
    SEVEN("Seven"),
    EIGHT("Eight"),
    NINE("Nine"),
    TEN("Ten"),
    JACK("Jack"),
    QUEEN("Queen"),
    KING("King");

    private String face;

    Faces(String face) {
        this.face = face;
    }

    public String getFace() {
        return this.face;
    }

    @Override
    public String toString() {
        return this.face;
    }
}
