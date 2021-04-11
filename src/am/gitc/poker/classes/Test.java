package am.gitc.poker.classes;

import am.gitc.poker.classes.Combination;
import am.gitc.poker.classes.Game;
import am.gitc.poker.classes.Hand;
import am.gitc.poker.enums.CardSuit;
import am.gitc.poker.enums.CardValue;
import am.gitc.poker.readers.CombinationReader;
import am.gitc.poker.resolver.CombinationResolver;


import java.io.*;
import java.util.*;

public class Test {

    public static void main(String[] args) {


        List<Card> cards = new ArrayList<>(52);
        for (CardSuit suit : CardSuit.values()) {
            for (CardValue value : CardValue.values()) {
                cards.add(new Card(suit, value));
            }
        }
        try (OutputStream out = new FileOutputStream("combinations.txt")) {
            for (int i = 0; i < 1000; i++) {
                List<Card> crds = new ArrayList(cards);
                Collections.shuffle(crds);

                for (int j = 0; j < 5; j++) {
                    Card card = crds.get(j);
                    out.write((card.getSuit().getValue() + card.getValue().getValue() + " ").getBytes());
                }
                out.write("== ".getBytes());
                for (int j = 5; j < 10; j++) {
                    Card card = crds.get(j);
                    out.write((card.getSuit().getValue() + card.getValue().getValue() + " ").getBytes());
                }
                out.write("\n".getBytes());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
