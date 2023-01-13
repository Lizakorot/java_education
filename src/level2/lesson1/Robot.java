package level2.lesson1;

public class Robot {
    protected String name;
    protected int run;
    protected int jump;

    public Robot(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
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

    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }

    public int getJump() {
        return jump;
    }
    public void jog(Treadmill treadmill)  {
        if (getRun()>=treadmill.getLength()){
            System.out.println(name+" пробежал");
        }else {
            System.out.println(name+" не пробежал");
        }
    }
    public void barrier(Wall wall) {
        if (getJump() >= wall.getWidth()) {
            System.out.println(name+" перепрыгнул");
        }else {
            System.out.println(name+" не перепрыгнул");
        }
    }
}
