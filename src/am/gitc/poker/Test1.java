package am.gitc.poker;

import am.gitc.poker.classes.Combination;
import am.gitc.poker.classes.Game;
import am.gitc.poker.readers.CombinationReader;
import am.gitc.poker.resolver.CombinationResolver;

import java.util.List;

public class Test1 {
    public static void main(String[] args) {
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
