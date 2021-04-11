package am.gitc.poker.classes;

import am.gitc.poker.enums.CardValue;
import am.gitc.poker.enums.Rank;

import java.util.List;

public class Hand {

    private List<Card> cards;

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return cards.toString();
    }
}
