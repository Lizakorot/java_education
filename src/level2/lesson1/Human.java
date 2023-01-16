package level2.lesson1;

public class Human extends Test{
    public Human(String name, int testrun, int testjump) {
        super(name,testrun,testjump);
    }
    public void runTreadmill(Treadmill[] treadmill) {
        for (int i =0;i<treadmill.length;i++)
        if (getTestRun() >= treadmill[i].getLength())
            System.out.println("Человек" + getName() + " СМОГ пробежать " + treadmill[i].getLength());
        else
            break;
    }

    public void jumpWall(Wall[] wall) {
        for (int i =0; i<wall.length;i++)
        if (getTestJump() >= wall[i].getWidth())
            System.out.println("Человек " + getName() + " СМОГ перепрыгнуть " + wall[i].getWidth());
        else
            break;

    }
}
