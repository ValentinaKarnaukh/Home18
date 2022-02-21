import java.util.Arrays;

public class HomeWork19 {
    static boolean isGreenLight = false;
    static int MAX_SPEED = 3;

    public static int amountLoser(int[] speeds) {
        int Loser = 0;
        for (int speed : speeds) {
            if (!isGreenLight) {
                if (MAX_SPEED < speed) {
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
                if (MAX_SPEED < speed) {
                    cnt++;
                }
            }
        }
        int[] speedsLoser = new int[cnt];
        int i = 0;
        for (int speed : speeds) {
            if (!isGreenLight) {
                if (MAX_SPEED < speed) {
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
                if (MAX_SPEED >= speed) {
                    cnt++;
                }
            }
        }
        int[] speedsWin = new int[cnt];
        int i = 0;
        for (int speed : speeds) {
            if (!isGreenLight) {
                if (MAX_SPEED >= speed) {
                    speedsWin[i] = speed;
                    i++;
                }
            }
        }
        return speedsWin;
    }

    public static String[] arrayNameWin(String[] namePlayers) {
        int cnt = 0;
        for (String text : namePlayers) {
            String[] players = text.split(" "); // [Tom 5]
            int speed = Integer.parseInt(players[1]);
            if (!isGreenLight) {
                if (speed < MAX_SPEED) {
                    cnt++;
                }
            }
        }

        String[] names = new String[cnt];
        int i = 0;
        for (String text : namePlayers) {
            String[] players = text.split(" "); // [Tom 5]
            int speed = Integer.parseInt(players[1]);
            if (!isGreenLight) {
                if (speed < MAX_SPEED) {
                    names[i] = players[0];
                    i++;
                }
            }
        }
        return names;
    }

    public static void main(String[] args) {
        int[] speedPlayers = new int[3];
        speedPlayers[0] = 5;
        speedPlayers[1] = 0;
        speedPlayers[2] = 2;
        amountLoser(speedPlayers);
        arraySpeedLoser(speedPlayers);
        arraySpeedWin(speedPlayers);


        String[] namePlayers = new String[3];
        namePlayers[0] = "Tom 5";
        namePlayers[1] = "Mike 0";
        namePlayers[2] = "John 2";

        arrayNameWin(namePlayers);

        System.out.println("Выбыло " + amountLoser(speedPlayers));
        System.out.println(Arrays.toString(arraySpeedLoser(speedPlayers)));
        System.out.println(Arrays.toString(arraySpeedWin(speedPlayers)));
        System.out.println(Arrays.toString(arrayNameWin(namePlayers)));
    }
}

