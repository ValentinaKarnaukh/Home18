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

}
