package ru.learnup.javaqa.learnupmvn.Game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {


    @Test
    public void shouldTellRoundsInRegularGame() {
        Game game = new Game(true);
        GameManager gameManager = new GameManager(game);

        int[] speedOfPlayer = {5, 3, 7, 6, 0};

        int actual = gameManager.roundsCNT(speedOfPlayer);
        int expected = 4;

        Assertions.assertEquals(expected, actual, "Amount Of Losers Incorrect");
    }

    @Test
    public void shouldTellRoundsInGameWithSpeed() {
        SpeedyGame speedyGame = new SpeedyGame(true, 4);
        GameManager speedyGameManager = new GameManager(speedyGame);
        int[] speedOfPlayer = {5, 3, 7, 6, 0};

        int actual = speedyGameManager.roundsCNT(speedOfPlayer);
        int expected = 3;

        Assertions.assertEquals(expected, actual, "Amount Of Losers Incorrect");
    }
}