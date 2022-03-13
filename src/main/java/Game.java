public class Game {
    protected boolean isGreenLight;

    public boolean isGreenLight() {
        return isGreenLight;
    }

    public void setGreenLight(boolean greenLight) {
        isGreenLight = greenLight;
    }

    public Game(boolean isGreenLight) {
        this.isGreenLight = isGreenLight;
    }

    boolean isFailed(int speed) {
        if (!isGreenLight) {
            if (speed != 0) {
            }
            return true;
        } else {
            return false;
        }
    }
}
