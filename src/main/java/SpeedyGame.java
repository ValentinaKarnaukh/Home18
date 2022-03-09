public class SpeedyGame extends Game {
    SpeedyGame(boolean isGreenLight) {
        super(isGreenLight);
    }

    static int MAX_SPEED;

    public static int getMaxSpeed() {
        return MAX_SPEED;
    }

    public static void setMaxSpeed(int maxSpeed) {
        MAX_SPEED = maxSpeed;
    }

    SpeedyGame(boolean isGreenLight, int MAX_SPEED) {
        super(Game.isGreenLight = isGreenLight);
        SpeedyGame.setMaxSpeed(MAX_SPEED);
    }

    @Override
    boolean isFailed(int speed) {
        if (!isGreenLight) {
            if (speed > getMaxSpeed()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}

