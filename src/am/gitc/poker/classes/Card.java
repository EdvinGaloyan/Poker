package am.gitc.poker.classes;

import am.gitc.poker.enums.CardSuit;
import am.gitc.poker.enums.CardValue;

import java.util.Collections;

public class Card implements Comparable<Card> {
    private CardSuit suit;
    private CardValue value;

    public Card() {
    }

    public Card(CardSuit suit, CardValue value) {
        this.suit = suit;
        this.value = value;
    }

    public CardSuit getSuit() {
        return suit;
    }

    public void setSuit(CardSuit suit) {
        this.suit = suit;
    }

    public CardValue getValue() {
        return value;
    }

    public void setValue(CardValue value) {
        this.value = value;
    }


    @Override
    public int compareTo(Card o) {
        return Integer.compare(o.value.ordinal(), this.value.ordinal());
    }

    @Override
    public String toString() {
        return suit.getValue() + value.getValue();
    }
}
