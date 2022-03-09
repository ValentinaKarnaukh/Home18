public class GameManager {

    private int[] speeds;

    public int[] getSpeeds() {
        return speeds;
    }

    public void setSpeeds(int[] speeds) {
        this.speeds = speeds;
    }

    public GameManager(Game game) {
        this.game = game;
    }

    Game game = new SpeedyGame(SpeedyGame.isGreenLight(), SpeedyGame.MAX_SPEED);


    public int rounds(int[] speeds) {
        int cnt = 0;
        if (!Game.isGreenLight) {
            for (int round : speeds) {
                if (round == 0) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public int roundsMaxSpeed(int[] speeds) {
        int cnt = 0;
        if (!Game.isGreenLight) {
            for (int round : speeds)
               if (round < SpeedyGame.MAX_SPEED) {
                    cnt++;
                }
        }
        return cnt;
    }
}