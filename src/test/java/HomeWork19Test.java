import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeWork19Test {

    @Test
    public void isRedLight() {
        boolean isGreenLight = false;
        boolean expected = false;
        boolean actual = HomeWork19.isGreenLight;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void twoLosers() {
        int[] speedPlayers = {5, 0, 2};
        int expected = 1;
        int actual = HomeWork19.amountLoser(speedPlayers);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void arrayLosers() {
        int[] speedPlayers = {5, 0, 2};
        int[] expected = {5};
        int[] actual = HomeWork19.arraySpeedLoser(speedPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void arrayWin() {
        int[] speedPlayers = {5, 0, 2};
        int[] expected = {0, 2};
        int[] actual = HomeWork19.arraySpeedWin(speedPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void arrayNameWin () {
        String[] namePlayers = {"Tom 5", "Mike 0","John 2"};
        String[] expected = {"Mike", "John"};
        String[] actual = HomeWork19.arrayNameWin(namePlayers);
        Assertions.assertArrayEquals(expected, actual);
    }
}

