public class GameManager {

    protected int[] speeds;

    public int[] getSpeeds() {
        return speeds;
    }

    public void setSpeeds(int[] speeds) {
        this.speeds = speeds;
    }

    public GameManager(Game game) {
        this.game = game;
    }

    Game game = new Game(false);


    public int rounds(int[] speeds) {
        int cnt = 0;
        if (!game.isGreenLight) {
            for (int round : speeds) {
                if (game.isFailed(round) == false) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}