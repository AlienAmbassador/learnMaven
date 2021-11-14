package ru.learnup.javaqa.learnupmvn.Game;

public class Game {

    protected boolean isGreenLight;

    public Game(boolean isGreenLight) {
        this.isGreenLight = isGreenLight;
    }

    public boolean getIsGreenLight() {
        return isGreenLight;
    }

    public void setGreenLight(boolean isGreenLight) {
        this.isGreenLight = isGreenLight;
    }

    public boolean isFailed(int speedOfPlayer){
        if (!isGreenLight){
            return speedOfPlayer > 0;
        }
        return false;
    }
}
