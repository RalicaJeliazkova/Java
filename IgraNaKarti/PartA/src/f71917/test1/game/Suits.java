package f71917.test1.game;

public enum Suits {

    CLUBS(1),
    DIAMONDS(2),
    HEARTS(3),
    SPADES(4);

    private int suiteIndex;

    Suits(int suiteIndex) {
        this.suiteIndex = suiteIndex;
    }

    public int getSuiteIndex() {
        return suiteIndex;
    }

}
