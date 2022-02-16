import java.util.Arrays;

public class HomeWork18 {
    static boolean isGreenLight = false;
    static int MAX_SPEED = 3;

    public static int amountLoser(int[] speeds) {
        int Loser = 0;
        for (int i = 0; i < speeds.length; i++) {
            if (MAX_SPEED < speeds[i]) {
                Loser = Loser + 1;
            }
        }
        return Loser;
    }

    public static int[] arraySpeedLoser(int[] speeds) {
        int cnt = 0;
        for (int speed : speeds) {
            if (MAX_SPEED < speed) {
                cnt++;
            }
        }
        int[] speedsLoser = new int[cnt];
        int i = 0;
        for (int speed : speeds) {
            if (MAX_SPEED < speed) {
                speedsLoser[i] = speed;
                i++;
            }
        }
        return speedsLoser;
    }

    public static int[] arraySpeedWin(int[] speeds) {
        int cnt = 0;
        for (int speed : speeds) {
            if (MAX_SPEED >= speed) {
                cnt++;
            }
        }
        int[] speedsWin = new int[cnt];
        int i = 0;
        for (int speed : speeds) {
            if (MAX_SPEED >= speed) {
                speedsWin[i] = speed;
                i++;
            }
        }
        return speedsWin;
    }

    public static void main(String[] args) {
        int[] speedPlayers = new int[3];
        speedPlayers[0] = 5;
        speedPlayers[1] = 0;
        speedPlayers[2] = 2;
        amountLoser(speedPlayers);
        arraySpeedLoser(speedPlayers);
        arraySpeedWin(speedPlayers);


        System.out.println("Выбыло " + amountLoser(speedPlayers));
        System.out.println(Arrays.toString(arraySpeedLoser(speedPlayers)));
        System.out.println(Arrays.toString(arraySpeedWin(speedPlayers)));
    }
}
