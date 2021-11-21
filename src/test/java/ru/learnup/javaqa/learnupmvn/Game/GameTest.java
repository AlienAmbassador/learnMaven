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

    @Test
    public void shouldTellNoOneLoses(){
        FastPlayer FPL = new FastPlayer(1, 3);
        ConstantPlayer CPL = new ConstantPlayer(1);

        SpeedyGame speedyGame = new SpeedyGame(false, 6);
        GameManager gameManager = new GameManager(speedyGame);
        Assertions.assertEquals(0, gameManager.loser(CPL, FPL, speedyGame, 4));

    }

    @Test
    public void shouldTellP1Loses(){
        FastPlayer FPL = new FastPlayer(1, 3);
        ConstantPlayer CPL = new ConstantPlayer(6);

        SpeedyGame speedyGame = new SpeedyGame(false, 7);
        GameManager gameManager = new GameManager(speedyGame);
        Assertions.assertEquals(-1, gameManager.loser(CPL, FPL, speedyGame, 4));
    }

    @Test
    public void shouldTellP2Loses(){
        FastPlayer FPL = new FastPlayer(5, 1);
        ConstantPlayer CPL = new ConstantPlayer(5);

        SpeedyGame speedyGame = new SpeedyGame(false, 5);
        GameManager gameManager = new GameManager(speedyGame);
        Assertions.assertEquals(1, gameManager.loser(CPL, FPL, speedyGame, 2));
    }
}