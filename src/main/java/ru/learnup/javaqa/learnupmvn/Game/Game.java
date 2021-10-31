package ru.learnup.javaqa.learnupmvn.Game;

import java.util.Arrays;

public class Game {

    public static boolean isGreenLight = true;
    public static int MAX_SPEED = 3;

    public static int amountOfLosers(int[] speed) {
        int cnt = 0;
        for (int j : speed) {
            if (isGreenLight) {
                if (j <= MAX_SPEED) cnt++;
            } else {
                if (j > MAX_SPEED) cnt++;
            }
        }
        return cnt;
    }

    public static int[] speedsOfLosers(int[] speed) {
        int[] losersSpeed = new int[amountOfLosers(speed)];
        int cnt = 0;
        for (int j : speed) {
            if (isGreenLight) {
                if (j <= MAX_SPEED) {
                    losersSpeed[cnt] = j;
                    cnt++;
                }

            } else {
                if (j > MAX_SPEED) {
                    losersSpeed[cnt] = j;
                    cnt++;
                }
            }
        }
        return losersSpeed;
    }

    public static int[] speedsOfWinners(int[] speed) {
        int[] winnersSpeed = new int[speed.length - amountOfLosers(speed)];
        int cnt = 0;
        for (int j : speed) {
            if (isGreenLight) {
                if (j > MAX_SPEED) {
                    winnersSpeed[cnt] = j;
                    cnt++;
                }

            } else {
                if (j <= MAX_SPEED) {
                    winnersSpeed[cnt] = j;
                    cnt++;
                }
            }
        }
        return winnersSpeed;
    }


    public static String[] winnersNames(String[] names) {
        int cnt = 0;
        String[] winners = new String[0];
        for (int i = 0; i < names.length; i++) {
            if (i % 2 != 0) {
                if (isGreenLight) {
                    if (Integer.parseInt(names[i]) > MAX_SPEED) {
                        winners = Arrays.copyOf(winners, (winners.length + 1));
                        winners[cnt] = names[i - 1];
                        cnt++;
                    }
                } else {
                    if (Integer.parseInt(names[i]) <= MAX_SPEED) {
                        winners = Arrays.copyOf(winners, (winners.length + 1));
                        winners[cnt] = names[i - 1];
                        cnt++;

                    }
                }
            }
        }
        return winners;
    }


    public static void main(String[] args) {
        String[] names = {"Danya", "10", "Kate", "2", "Vlad", "0", "Lada", "100500", "Kirill", "6"};
        int[] speedOfPlayers = {3, 4, 0, 6};
        System.out.println(amountOfLosers(speedOfPlayers));
        System.out.println(Arrays.toString(speedsOfLosers(speedOfPlayers)));
        System.out.println(Arrays.toString(speedsOfWinners(speedOfPlayers)));
        System.out.println(Arrays.toString(winnersNames(names)));
    }
}
