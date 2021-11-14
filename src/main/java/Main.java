import ru.learnup.javaqa.learnupmvn.Game.Game;
import ru.learnup.javaqa.learnupmvn.Game.SpeedyGame;
import ru.learnup.javaqa.learnupmvn.Game.GameManager;


public class Main {

    public static void main(String[] args) {
        int[] speedsOfPlayer = {5, 6, 7, 4, 3, 0};
        Game game = new Game(true);
        SpeedyGame speedyGame = new SpeedyGame(true, 5);
        GameManager gameManager = new GameManager(game);
        GameManager speedyGameManager = new GameManager(speedyGame);


        System.out.println("Обычная игра: " + " Сколько раундов продержится? " + gameManager.roundsCNT(speedsOfPlayer));
        System.out.println("Обычная игра + скорость :" + ", максимальная скорость - " + speedyGame.getMaxSpeed()
                + " Сколько раундов продержится? " + speedyGameManager.roundsCNT(speedsOfPlayer));
    }
}
