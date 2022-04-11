import java.util.Arrays;

public class HomeWork19 {
    static boolean isGreenLight = false;
    static int MAX_SPEED = 3;

    public static int amountLoser(int[] speeds) {
        if (isGreenLight) {
            int loser = 0;
            for (int speed : speeds) {
                if (speed > MAX_SPEED) {
                    loser++;
                }
            }
            return loser;
        } else {
            int win = 0;
            for (int speed : speeds) {
                win++;
            }
            return win;
        }
    }

    public static int[] arraySpeedLoser(int[] speeds) {
        if (isGreenLight) {
            int cnt = 0;
            for (int speed : speeds) {
                if (speed > MAX_SPEED) {
                    cnt++;
                }
            }
            int[] speedsLoser = new int[cnt];
            int i = 0;
            for (int speed : speeds) {
                if (speed > MAX_SPEED) {
                    speedsLoser[i] = speed;
                    i++;
                }
            }
            return speedsLoser;
        } else {
            int cnt = 0;
            for (int speed : speeds) {
                cnt++;
            }
            int[] speedsLoser = new int[cnt];
            int i = 0;
            for (int speed : speeds) {
                speedsLoser[i] = speed;
                i++;
            }
            return speedsLoser;
        }
    }

    public static int[] arraySpeedWin(int[] speeds) {
        if (isGreenLight) {
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
        } else {
            int cnt = 0;
            for (int speed : speeds) {
                cnt++;
            }
            int[] speedsWin = new int[cnt];
            int i = 0;
            for (int speed : speeds) {
                speedsWin[i] = speed;
                i++;
            }
            return speedsWin;
        }
    }

    public static String[] arrayNameWin(String[] namePlayers) {
        int cnt = 0;
        for (String text : namePlayers) {
            String[] players = text.split(" "); // [Tom 5]
            int speed = Integer.parseInt(players[1]);
            if (isGreenLight) {
                if (speed <= MAX_SPEED) {
                    cnt++;
                }
            } else {
                cnt++;
            }
        }


        String[] names = new String[cnt];
        int i = 0;
        for (
                String text : namePlayers) {
            String[] players = text.split(" ");
            int speed = Integer.parseInt(players[1]);
            if (isGreenLight) {
                if (speed <= MAX_SPEED) {
                    names[i] = players[0];
                    i++;
                }
            } else {
                names[i] = players[0];
                i++;
            }
        }

        return names;
    }
}

