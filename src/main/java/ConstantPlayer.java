public class ConstantPlayer implements Movable {
    private int startSpeed;

    public ConstantPlayer(int startSpeed) {
        this.startSpeed = startSpeed;
    }

    @Override
    public int getSpeed() {

        return startSpeed;
    }
}
