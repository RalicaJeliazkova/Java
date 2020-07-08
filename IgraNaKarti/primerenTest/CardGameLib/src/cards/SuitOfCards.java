package cards;

public enum SuitOfCards {
    CLUBS("Clubs"),
    DIAMONDS("Diamonds"),
    HEARTS("Hearts"),
    SPADES("Spades");

    private final String value;

    SuitOfCards(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
