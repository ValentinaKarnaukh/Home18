import java.util.Arrays;

public class HomeWork18 {
    static boolean isGreenLight = false;
    static int MAX_SPEED = 3;

    public static int amountLoser(int[] speeds) {
        int Loser = 0;
        for (int speed : speeds) {
            if (!isGreenLight) {
                if (speed > MAX_SPEED) {
                    Loser = Loser + 1;
                }
            }
        }
        return Loser;
    }

    public static int[] arraySpeedLoser(int[] speeds) {
        int cnt = 0;
        for (int speed : speeds) {
            if (!isGreenLight) {
                if (speed > MAX_SPEED) {
                    cnt++;
                }
            }
        }
        int[] speedsLoser = new int[cnt];
        int i = 0;
        for (int speed : speeds) {
            if (!isGreenLight) {
                if (speed > MAX_SPEED) {
                    speedsLoser[i] = speed;
                    i++;
                }
            }
        }
        return speedsLoser;
    }

    public static int[] arraySpeedWin(int[] speeds) {
        int cnt = 0;
        for (int speed : speeds) {
            if (!isGreenLight) {
                if (speed <= MAX_SPEED) {
                    cnt++;
                }
            }
        }
        int[] speedsWin = new int[cnt];
        int i = 0;
        for (int speed : speeds) {
            if (!isGreenLight) {
                if (speed <= MAX_SPEED) {
                    speedsWin[i] = speed;
                    i++;
                }
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
