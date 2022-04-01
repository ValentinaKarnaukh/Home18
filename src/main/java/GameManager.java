public class GameManager {

    public GameManager(Game game) {
        this.game = game;
    }

    Game game;


    public int rounds(int[] speeds) {
        int cnt = 0;
        for (int round : speeds) {
            if (!game.isFailed(round)) {
                cnt++;
            } else continue;
        }
        return cnt;
    }

    public int loser(Movable p1, Movable p2, Game game, int rounds) {
        int i = 0;
        int x = 0;
        while (x < rounds) {
            if (game.isFailed(p1.getSpeed())) {
                if (game.isFailed(p2.getSpeed())) {
                    i = 0;
                    break;
                } else {
                    i = -1;
                    break;
                }
            } else {
                if (game.isFailed(p2.getSpeed())) {
                    i = 1;
                    break;
                }
            }
            x++;
        }
        return i;
    }

}