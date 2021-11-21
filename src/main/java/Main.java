import ru.learnup.javaqa.learnupmvn.Game.*;


public class Main {

    public static void main(String[] args) {
        int[] speedsOfPlayer = {5, 6, 7, 4, 3, 0};
        Game game = new Game(true);
        SpeedyGame speedyGame = new SpeedyGame(true, 5);
        GameManager gameManager = new GameManager(game);
        GameManager speedyGameManager = new GameManager(speedyGame);
        FastPlayer fastPlayer = new FastPlayer(2, 1);
        ConstantPlayer constPlayer = new ConstantPlayer(4);


        System.out.println("* возвращает -1, если p1 проиграет раньше в игру game если будет rounds раундов;\n" +
                "* возвращает 1, если p2 проиграет раньше в игру game если будет rounds раундов;\n" +
                "* возвращает 0, если никто не успеет проиграть ------- " + gameManager.loser(fastPlayer, constPlayer, speedyGame, 5));


        System.out.println("Обычная игра: " + " Сколько раундов продержится? " + gameManager.roundsCNT(speedsOfPlayer));
        System.out.println("Обычная игра + скорость :" + ", максимальная скорость - " + speedyGame.getMaxSpeed()
                + " Сколько раундов продержится? " + speedyGameManager.roundsCNT(speedsOfPlayer));

    }
}