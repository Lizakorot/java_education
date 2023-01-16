package level2.lesson1;

public class Robot extends Test{
    public Robot(String name,int testrun, int testjump) {
        super(name,testrun,testjump);
    }
    public void runTreadmill(Treadmill[] treadmill) {
        for (int i =0;i<treadmill.length;i++)
        if (treadmill[i].getLength() <= getTestRun() )
            System.out.println("Робот " + getName() + " СМОГ пробежать " + treadmill[i].getLength() );
        else System.out.println("Робот" + getName() + " НЕ СМОГ пробежать " + treadmill[i].getLength());
    }

    public void jumpWall(Wall[] wall) {
        for (int i =0; i<wall.length;i++)
        if (wall[i].getWidth() <= getTestJump())
            System.out.println("Робот " + getName() + " СМОГ перепрыгнуть " + wall[i].getWidth());
        else System.out.println("Робот " + getName() + " НЕ СМОГ перепрыгнуть " + wall[i].getWidth());
    }
}
