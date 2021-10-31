package ru.learnup.javaqa.learnupmvn.Game;

import java.util.Arrays;

public class Game {

    public static boolean isGreenLight = false;
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

    public static void main(String[] args) {
        int[] speedOfPlayers = {3, 4, 0, 6};
        System.out.println(amountOfLosers(speedOfPlayers));
        System.out.println(Arrays.toString(speedsOfLosers(speedOfPlayers)));
        System.out.println(Arrays.toString(speedsOfWinners(speedOfPlayers)));
    }
}
