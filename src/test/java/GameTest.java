import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    public void GamePlayer1() {
        Game game = new Game(false);
        int speed = 5;
        boolean actual = game.isFailed(speed);
        Assertions.assertTrue(actual);
    }

    @Test
    public void GamePlayer2() {
        Game game = new Game(false);
        int speed = 0;
        boolean expected = true;
        boolean actual = game.isFailed(speed);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void GamePlayer3() {
        Game game = new Game(false);
        int speed = 2;
        boolean actual = game.isFailed(speed);
        Assertions.assertTrue(actual);
    }
}
