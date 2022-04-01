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

    Game game = new Game(true);


    public int rounds(int[] speeds) {
        int cnt = 0;
            for (int round : speeds) {
                if (game.isFailed(round) == false) {
                    cnt++;
                } else break;
        }
        return cnt;
    }
}