package level2.lesson1;
public class Cat extends Test {
    public Cat(String name, int testrun, int testjump) {
        super(name,testrun,testjump);
    }

    public void runTreadmill(Treadmill[] treadmill) {
        for (int i =0;i<treadmill.length;i++)
        if (getTestRun() >= treadmill[i].getLength())
            System.out.println("Кот " + getName() + " СМОГ пробежать " + treadmill[i].getLength() + " метров");
         else {
            System.out.println("Кот " + getName() + " НЕ СМОГ пробежать " + treadmill[i].getLength() + " метров");
        }
    }
    public void jumpWall(Wall[] wall) {
        for (int i =0; i<wall.length;i++)
        if (getTestJump() >= wall[i].getWidth())
            System.out.println("Кот " + getName() + " СМОГ перепрыгнуть " + wall[i].getWidth());
        else {
            System.out.println("Кот " + getName() + " НЕ СМОГ перепрыгнуть " + wall[i].getWidth());
        }
    }
}

