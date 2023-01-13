package level2.lesson1;

public class Human {
    protected String name;
    protected int run;
    protected int jump;

    public Human(String name, int run, int jump) {
        this.name = name;
        this.run = run;
        this.jump = jump;
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
    public void jog (Treadmill treadmill){
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
