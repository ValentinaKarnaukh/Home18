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
        HomeWork19.isGreenLight = false;
        int[] speedPlayers = {5, 0, 2};
        int expected = 3;
        int actual = HomeWork19.amountLoser(speedPlayers);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void arrayLosers() {
        HomeWork19.isGreenLight = true;
        int[] speedPlayers = {5, 0, 2};
        int[] expected = {5};
        int[] actual = HomeWork19.arraySpeedLoser(speedPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void arrayWin() {
        HomeWork19.isGreenLight = true;
        int[] speedPlayers = {5, 0, 2};
        int[] expected = {0, 2};
        int[] actual = HomeWork19.arraySpeedWin(speedPlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void arrayNameWin () {
        HomeWork19.isGreenLight = true;
        HomeWork19.MAX_SPEED = 3;
        String[] namePlayers = {"Tom 5", "Mike 0","John 2"};
        String[] expected = {"Mike", "John"};
        String[] actual = HomeWork19.arrayNameWin(namePlayers);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void arrayNameWin2 () {
        HomeWork19.isGreenLight = false;
        HomeWork19.MAX_SPEED = 3;
        String[] namePlayers = {"Tom 5", "Mike 0","John 2"};
        String[] expected = {"Tom", "Mike", "John"};
        String[] actual = HomeWork19.arrayNameWin(namePlayers);
        Assertions.assertArrayEquals(expected, actual);
    }
}

