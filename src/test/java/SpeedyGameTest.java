import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SpeedyGameTest {

    @Test
    public void SpeedyGamePlayer1() {
        SpeedyGame speedyGame = new SpeedyGame(false, 3);
        int speed = 5;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertTrue(actual);
    }

    @Test
    public void SpeedyGamePlayer2() {
        SpeedyGame speedyGame = new SpeedyGame(false, 3);
        int speed = 0;
        boolean expected = false;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SpeedyGamePlayer3() {
        SpeedyGame speedyGame = new SpeedyGame(false, 3);
        int speed = 2;
        boolean expected = false;
        boolean actual = speedyGame.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }
}
