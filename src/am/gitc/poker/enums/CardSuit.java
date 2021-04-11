package am.gitc.poker.enums;

public enum CardSuit {
    CLUBS("C"),
    DIAMONDS("D"),
    HEARTS("H"),
    SPADES("S");
    private final String value;


    public static CardSuit valueOfByValue(String value) {
        for (CardSuit cardSuit : values()) {
            if (cardSuit.value.equals(value)) {
                return cardSuit;
            }
        }
        throw new IllegalArgumentException("dont exiest");

    }


    CardSuit(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


}
