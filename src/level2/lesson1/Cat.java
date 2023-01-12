package level2.lesson1;

public class Cat {
    protected String name;
    protected int run;
    protected int jump;
    public Cat(String name){
        this.name=name;
        this.run=500;
        this.jump=30;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cat{");
        sb.append("name='").append(name).append('\'');
        sb.append(", run=").append(run);
        sb.append(", jump=").append(jump);
        sb.append('}');
        return sb.toString();
    }
    public void barri(Wall wall){
        wall.overcoming(jump);
    }
    public void tra (Treadmill treadmill) {
        treadmill.distance(run);
    }
}
