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

    public int loser(Movable p1, Movable p2, int rounds) {
        int i = 0;
        int x = 0;
        if (game.isGreenLight()) {
            x = 0;
        } else {
            if (game.isFailed(p1.getSpeed())) {
                while (i != rounds) {
                    if (game.isFailed(p2.getSpeed())) {
                        i++;
                    } else {
                        x = -1;
                        break;
                    }
                }
            } else {
                if (!game.isFailed(p2.getSpeed())) {
                    x = 0;
                } else {
                    x = 1;
                }
            }
        }
        return x;
    }

}