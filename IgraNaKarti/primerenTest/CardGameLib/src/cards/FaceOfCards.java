package cards;

public enum FaceOfCards {

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


    private final String value ;

    FaceOfCards(String value) {
        this.value = value;
    }

    public String getValue () {
    return value;
    }
}
