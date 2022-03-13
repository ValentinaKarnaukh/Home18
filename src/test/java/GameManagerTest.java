import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameManagerTest {

    @Test
    public void SpeedGame() {
        GameManager gameManager = new GameManager(new Game(false));
        gameManager.setSpeeds(new int[]{5, 0, 2, 4, 3});

        int expected = 1;
        int actual = gameManager.rounds(gameManager.getSpeeds());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SpeedSpeedyGame() {
        GameManager gameManager = new GameManager(new SpeedyGame(false, 3));
        gameManager.setSpeeds(new int[]{5, 0, 2, 4, 3});

        int expected = 3;
        int actual = gameManager.rounds(gameManager.getSpeeds());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TwoPlayersWin() {
        GameManager gameManager = new GameManager(new SpeedyGame(false, 3));
        Movable p1 = new ConstantPlayer(1);
        Movable p2 = new FastPlayer(1, 1);

        int expected = 0;
        int actual = gameManager.loser(p1, p2,3 );

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PlayerOneWin() {
        GameManager gameManager = new GameManager(new SpeedyGame(false, 3));
        Movable p1 = new ConstantPlayer(1);
        Movable p2 = new FastPlayer(3, 1);

        int expected = 1;
        int actual = gameManager.loser(p1, p2,2 );

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PlayerTwoWin() {
        GameManager gameManager = new GameManager(new SpeedyGame(false, 3));
        Movable p1 = new ConstantPlayer(5);
        Movable p2 = new FastPlayer(0, 1);

        int expected = -1;
        int actual = gameManager.loser(p1, p2,5 );

        Assertions.assertEquals(expected, actual);
    }

}
