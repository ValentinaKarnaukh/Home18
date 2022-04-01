public class SpeedyGame extends Game {
    private int MAX_SPEED;
    public SpeedyGame(boolean isGreenLight, int MAX_SPEED) {
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
    public boolean isFailed(int speed) {
        if ((getIsGreenLight() == false) &&(speed > MAX_SPEED)) {
            return true;
        } else{
            return false;
        }
    }
}