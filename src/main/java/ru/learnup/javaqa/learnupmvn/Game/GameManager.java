package ru.learnup.javaqa.learnupmvn.Game;

import ru.learnup.javaqa.learnupmvn.Game.Movable;

public class GameManager {
    private final Game game;

    public GameManager(Game game) {
        this.game = game;
    }

    public int roundsCNT(int[] playerSpeeds) {
        int cnt = 0;
        for (int playerSpeed : playerSpeeds) {
            if (!game.isFailed(playerSpeed)) {
                cnt++;
            }
        }
        return cnt;
    }

    public int loser(Movable player1, Movable player2, Game game, int rounds) {

        for (int i = 0; i < rounds; i++) {

            boolean failed1 = game.isFailed(player1.getSpeed());
            boolean failed2 = game.isFailed(player2.getSpeed());

            if (failed1 && !failed2) {
                return -1;
            }

            if (!failed1 && failed2) {
                return 1;
            }
        }

        return 0;
    }
}
