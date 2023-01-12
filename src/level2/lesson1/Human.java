package level2.lesson1;

public class Human {
    protected String name;
    protected int run;
    protected int jump;
    public Human(String name){
        this.name=name;
        this.run=300;
        this.jump=10;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("human{");
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
    public void barr(Wall wall){
        wall.overcoming(jump);
    }
    public void trac (Treadmill treadmill) {
        treadmill.distance(run);
    }
}
