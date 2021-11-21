package ru.learnup.javaqa.learnupmvn.Game;

public class FastPlayer implements Movable {

    protected int startSpeed;
    protected final int speedStep;

    public FastPlayer(int startSpeed, int speedStep) {
        this.startSpeed = startSpeed;
        this.speedStep = speedStep;
    }

    @Override
    public int getSpeed() {
        int rtn = startSpeed;
        if (startSpeed + speedStep < 0) {
            startSpeed = 0;
        } else {
            startSpeed += speedStep;
        }
        return rtn;
    }
}