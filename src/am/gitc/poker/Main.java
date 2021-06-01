package am.gitc.poker;

import am.gitc.poker.classes.Card;
import am.gitc.poker.classes.Combination;
import am.gitc.poker.classes.Game;
import am.gitc.poker.enums.CardSuit;
import am.gitc.poker.enums.CardValue;
import am.gitc.poker.readers.CombinationReader;
import am.gitc.poker.resolver.CombinationResolver;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        // File Creating
        /*List<Card> cards = new ArrayList<>(52);
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
        }*/

        //File Reading
        List<Game> games = CombinationReader.read("text.txt");

        for (Game game : games) {
            System.out.println("Combinations is`");
            Combination firstPlayer = CombinationResolver.resolve(game.getFirstPlayer());
            Combination secondPlayer = CombinationResolver.resolve(game.getSecondPlayer());
            System.out.println(game.getFirstPlayer() + " "
                    + firstPlayer.getRank() + "   " + secondPlayer.getRank() + " " + game.getSecondPlayer());
        }

    }
}