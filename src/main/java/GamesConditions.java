public class GamesConditions {
    boolean isGreenLight;
    int MAX_SPEED;

    public GamesConditions(boolean isGreenLight, int MAX_SPEED) {
        this.isGreenLight = isGreenLight;
        this.MAX_SPEED = MAX_SPEED;
    }

    public int amountLoser(String[] namePlayers) {
        int Loser = 0;
        for (String text : namePlayers) {
            String[] players = text.split(" ");
            int speed = Integer.parseInt(players[1]);
            if (!isGreenLight) {
                if (MAX_SPEED < speed) {
                    Loser = Loser + 1;
                }
            }
        }
        return Loser;
    }

    public int[] arraySpeedLoser(String[] namePlayers) {
        int cnt = 0;
        for (String text : namePlayers) {
            String[] players = text.split(" ");
            int speed = Integer.parseInt(players[1]);
            if (!isGreenLight) {
                if (MAX_SPEED < speed) {
                    cnt++;
                }
            }
        }
        int[] speedsLoser = new int[cnt];
        int i = 0;
        for (String text : namePlayers) {
            String[] players = text.split(" ");
            int speed = Integer.parseInt(players[1]);
            if (!isGreenLight) {
                if (MAX_SPEED < speed) {
                    speedsLoser[i] = speed;
                    i++;
                }
            }
        }
        return speedsLoser;
    }

    public int[] arraySpeedWin(String[] namePlayers) {
        int cnt = 0;
        for (String text : namePlayers) {
            String[] players = text.split(" ");
            int speed = Integer.parseInt(players[1]);
            if (!isGreenLight) {
                if (MAX_SPEED >= speed) {
                    cnt++;
                }
            }
        }
        int[] speedsWin = new int[cnt];
        int i = 0;
        for (String text : namePlayers) {
            String[] players = text.split(" ");
            int speed = Integer.parseInt(players[1]);
            if (!isGreenLight) {
                if (MAX_SPEED >= speed) {
                    speedsWin[i] = speed;
                    i++;
                }
            }
        }
        return speedsWin;
    }


    public String[] arrayNameWin(String[] namePlayers) {
        int cnt = 0;
        for (String text : namePlayers) {
            String[] players = text.split(" ");
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
            String[] players = text.split(" ");
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
}
