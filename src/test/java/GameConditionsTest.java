import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameConditionsTest {
    @Test
    public void losers() {
        GamesConditions gamesConditions = new GamesConditions(false, 3);
        String[] namePlayers = {"Tom 5", "Mike 0", "John 2"};
        int expected = 1;
        int actual = gamesConditions.amountLoser(namePlayers);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void arrayLosers() {
        GamesConditions gamesConditions = new GamesConditions(false, 3);
        String[] namePlayers = {"Tom 5", "Mike 0", "John 2"};
        int[] expected = {5};
        int[] actual = gamesConditions.arraySpeedLoser(namePlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void arrayWin() {
        GamesConditions gamesConditions = new GamesConditions(false, 3);
        String[] namePlayers = {"Tom 5", "Mike 0", "John 2"};
        int[] expected = {0, 2};
        int[] actual = gamesConditions.arraySpeedWin(namePlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void arrayNameWin() {
        GamesConditions gamesConditions = new GamesConditions(false, 3);
        String[] namePlayers = {"Tom 5", "Mike 0", "John 2"};
        String[] expected = {"Mike", "John"};
        String[] actual = gamesConditions.arrayNameWin(namePlayers);
        Assertions.assertArrayEquals(expected, actual);
    }
}
