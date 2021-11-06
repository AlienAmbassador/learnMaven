package ru.learnup.javaqa.learnupmvn.Game;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {


    @Test
    public void shouldTellAmountOfLosers() {
        Game game = new Game(true, 3);
        int[] speed = new int[]{1, 4, 0};
        int actual = game.amountOfLosers(speed);
        byte expected;
        if (game.isGreenLight) {
            expected = 2;
        } else {
            expected = 1;
        }

        Assertions.assertEquals(expected, actual, "Amount Of Losers Incorrect");
    }

    @Test
    public void shouldTellSpeedsOfLosers() {
        Game game = new Game(true, 3);
        int[] speed = new int[]{1, 4, 0};
        int[] actual = game.speedsOfLosers(speed);
        int[] expected;
        if (game.isGreenLight) {
            expected = new int[]{1, 0};
        } else {
            expected = new int[]{4};
        }

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTellSpeedsOfWinners() {
        Game game = new Game(true, 3);
        int[] speed = new int[]{1, 4, 0};
        int[] actual = game.speedsOfWinners(speed);
        int[] expected;
        if (game.isGreenLight) {
            expected = new int[]{4};
        } else {
            expected = new int[]{1, 0};
        }
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldTellWinnersNames() {
        Game game = new Game(true, 3);
        String[] names = {"Kolya", "10", "Petya", "2", "Natasha", "15"};
        String[] actual = game.winnersNames(names);

        String[] expected;
        if (game.isGreenLight) {
            expected = new String[]{"Kolya", "Natasha"};
        } else {
            expected = new String[]{"Petya"};
        }
        Assertions.assertArrayEquals(actual, expected);
    }

}

