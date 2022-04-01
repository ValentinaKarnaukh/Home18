import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameManagerTest {

    @Test
    public void SpeedGame() {
        GameManager gameManager = new GameManager(new Game(true));

        int expected = 5;
        int actual = gameManager.rounds(new int[]{5, 0, 2, 4, 3});

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SpeedSpeedyGame() {
        GameManager gameManager = new GameManager(new SpeedyGame(true, 3));

        int expected = 5;
        int actual = gameManager.rounds(new int[]{5, 0, 2, 4, 3});

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TwoPlayersWin() {
        GameManager gameManager = new GameManager(new Game(false));
        int expected = 0;
        int actual = gameManager.loser(new FastPlayer(0,1), new FastPlayer(0,1), new Game(false),5);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PlayerOneWin() {
        GameManager gameManager = new GameManager(new Game(false));
        int expected = 1;
        int actual = gameManager.loser(new FastPlayer(0,1), new ConstantPlayer(1), new Game(false),5);
        Assertions.assertEquals(expected, actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void PlayerTwoWin() {
        GameManager gameManager = new GameManager(new Game(false));
        int expected = -1;
        int actual = gameManager.loser(new ConstantPlayer(1), new FastPlayer(0,1), new Game(false),5);

        Assertions.assertEquals(expected, actual);
    }

}
