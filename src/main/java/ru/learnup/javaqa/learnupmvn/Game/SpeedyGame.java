package ru.learnup.javaqa.learnupmvn.Game;

public class SpeedyGame extends Game {

    private int maxSpeed;

    public SpeedyGame(boolean isGreenLight, int maxSpeed) {
        super(isGreenLight);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean isFailed(int speedOfPlayer) {
        if (isGreenLight) {
            return speedOfPlayer <= maxSpeed;
        } else {
            return speedOfPlayer != maxSpeed;
        }
    }
}