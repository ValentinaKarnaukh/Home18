public class Game {
    public static boolean isGreenLight;

    public static boolean isGreenLight() {
        return isGreenLight;
    }

    public void setGreenLight(boolean greenLight) {
        isGreenLight = greenLight;
    }

    Game(boolean isGreenLight) {
        Game.isGreenLight = isGreenLight;
    }

    boolean isFailed(int speed) {
        if (!isGreenLight) {
            if (speed > 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
