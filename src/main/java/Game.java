public class Game {
    private boolean isGreenLight;

    public boolean getIsGreenLight() {
        return isGreenLight;
    }

    public void setIsGreenLight(boolean newIsGreenLight) {
        isGreenLight = newIsGreenLight;
    }

    public Game(boolean isGreenLight) {
        this.isGreenLight = isGreenLight;
    }

    boolean isFailed(int speed) {
        if ((isGreenLight == false) && (speed != 0)) {
            return true;
        } else {
            return false;
        }
    }
}
