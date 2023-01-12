package level2.lesson1;

public class Robot {
    protected String name;
    protected int run;
    protected int jump;
    public Robot (String name){
        this.name=name;
        this.run=800;
        this.jump=100;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Robot{");
        sb.append("name='").append(name).append('\'');
        sb.append(", run=").append(run);
        sb.append(", jump=").append(jump);
        sb.append('}');
        return sb.toString();
    }

    public int getRun() {
        return run;
    }
    public int getJump() {
        return jump;
    }
    public void barrier(Wall wall){
        wall.overcoming(jump);
    }
    public void track (Treadmill treadmill) {
        treadmill.distance(run);
    }
}
