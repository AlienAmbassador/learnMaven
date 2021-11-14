import ru.learnup.javaqa.learnupmvn.Game.Game;
import ru.learnup.javaqa.learnupmvn.Game.SpeedyGame;


public class Main {

    public static void main(String[] args) {
        Game game = new Game(false);
        int[] speedOfPlayers = {3, 4, 0, 6};
        SpeedyGame speedyGame = new SpeedyGame(false, 4);

        for (int i = 0; i < speedOfPlayers.length; i++) {
            System.out.println("Обычная игра: " + "скорость игрока - " + speedOfPlayers[i]
                    + " Выбывает ли игрок? - " + game.isFailed(speedOfPlayers[i]));
            System.out.println("Обычная игра + скорость :" + "скорость игрока - " + speedOfPlayers[i]
                    + ", максимальная скорость - " + speedyGame.getMaxSpeed() + " Выбывает ли игрок? - " + speedyGame.isFailed(speedOfPlayers[i]));
        }
    }
}

