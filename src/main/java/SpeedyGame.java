public class SpeedyGame extends Game {
    int MAX_SPEED;
    SpeedyGame(boolean isGreenLight, int MAX_SPEED) {
        super(isGreenLight);
        this.MAX_SPEED = MAX_SPEED;
    }

    public int getMaxSpeed() {
        return MAX_SPEED;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.MAX_SPEED = maxSpeed;
    }

    @Override
    boolean isFailed(int speed) {
        if ((!isGreenLight) &&(speed > MAX_SPEED)) {
            return true;
        } else{
            return false;
        }
    }
}

