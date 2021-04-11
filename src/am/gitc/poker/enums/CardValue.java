package am.gitc.poker.enums;

public enum CardValue {

    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("J"),
    QUEEN("Q"),
    KING("K"),
    ACE("A");

    public static CardValue valueOfByValue(String value) {
        for (CardValue cardValue : values()) {
            if (cardValue.value.equals(value)) {
                return cardValue;
            }
        }
        throw new IllegalArgumentException("dont exist");

    }


    private final String value;

    CardValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
