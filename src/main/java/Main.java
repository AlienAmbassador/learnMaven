import ru.learnup.javaqa.learnupmvn.Game.Game;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Game game = new Game(false, 5);
        String[] names = {"Danya", "10", "Kate", "2", "Vlad", "0", "Lada", "100500", "Kirill", "6"};
        int[] speedOfPlayers = {3, 4, 0, 6};
        System.out.println(game.amountOfLosers(speedOfPlayers));
        System.out.println(Arrays.toString(game.speedsOfLosers(speedOfPlayers)));
        System.out.println(Arrays.toString(game.speedsOfWinners(speedOfPlayers)));
        System.out.println(Arrays.toString(game.winnersNames(names)));
    }
}
