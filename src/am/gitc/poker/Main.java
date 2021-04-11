package am.gitc.poker;

import am.gitc.poker.classes.Card;
import am.gitc.poker.enums.CardSuit;
import am.gitc.poker.enums.CardValue;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>(52);
        for (CardSuit cardSuit : CardSuit.values()) {
            for (CardValue cardValue : CardValue.values()) {
                cards.add(new Card(cardSuit, cardValue));
            }
        }
        System.out.println("");
        try (FileWriter fileWriter = new FileWriter("text.txt")) {

            for (int i = 0; i < 1000; i++) {
                List<Card> crds = new ArrayList<>(cards);
                Collections.shuffle(crds);
                for (int j = 0; j < 5; j++) {
                    Card card = crds.get(j);
                    fileWriter.write(((card.getSuit().getValue() + card.getValue().getValue() + " ")));
                }
                fileWriter.write("== ");
                for (int j = 5; j < 10; j++) {
                    Card card = crds.get(j);
                    fileWriter.write(((card.getSuit().getValue() + card.getValue().getValue() + " ")));
                }
                fileWriter.write("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}