package ru.learnup.javaqa.learnupmvn.Game;

import java.util.Arrays;

public class Game {

    public boolean isGreenLight;
    public int MAX_SPEED;

    public Game(boolean isGreenLight, int MAX_SPEED) {
        this.isGreenLight = isGreenLight;
        this.MAX_SPEED = MAX_SPEED;
    }

    public int amountOfLosers(int[] speed) {
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

    public int[] speedsOfLosers(int[] speed) {
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

    public int[] speedsOfWinners(int[] speed) {
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


    public String[] winnersNames(String[] names) {
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
}
