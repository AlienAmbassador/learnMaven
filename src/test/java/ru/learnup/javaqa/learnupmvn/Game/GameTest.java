//package ru.learnup.javaqa.learnupmvn.Game;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//public class GameTest {
//
//
//    @Test
//    public void shouldTellIfLosesInRegularGame() {
//        Game game = new Game(true);
//        int speedOfPlayer = 5;
//
//        boolean actual = game.isFailed(speedOfPlayer);
//        boolean expected = false;
//
//        Assertions.assertEquals(expected, actual, "Amount Of Losers Incorrect");
//    }
//
//    @Test
//    public void shouldTellIfLosesInGameWithMaxSpeed() {
//        SpeedyGame speedyGame = new SpeedyGame(true, 4);
//        int speedOfPlayer = 5;
//
//        boolean actual = speedyGame.isFailed(speedOfPlayer);
//        boolean expected = false;
//
//        Assertions.assertEquals(expected, actual, "Amount Of Losers Incorrect");
//    }
//}