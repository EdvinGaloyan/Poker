package am.gitc.poker.classes;

import am.gitc.poker.enums.CardValue;
import am.gitc.poker.enums.Rank;

public class Combination {
    private Rank rank;
    private CardValue cardValue;
    private CardValue secondHighCard;

    public Combination(Rank rank, CardValue cardValue, CardValue secondHighCard) {
        this.rank = rank;
        this.cardValue = cardValue;
        this.secondHighCard = secondHighCard;
    }

    public Combination(Rank rank, CardValue cardValue) {
        this.rank = rank;
        this.cardValue = cardValue;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public CardValue getCardValue() {
        return cardValue;
    }

    public void setCardValue(CardValue cardValue) {
        this.cardValue = cardValue;
    }
}
