package ru.learnup.javaqa.learnupmvn.Game;

public class GameManager {
    private Game game;

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
}