package level2.lesson1;

public class dz1 {
    public static int MEMBERS = 5;
    public static int WALLS = 3;
    public static int LENGTH = 3;

    public static void main(String[] args) {
        int Stage = 0;
        Test test[] = new Test[MEMBERS];
        test[0] = new Cat("Барсик", 400, 10);
        test[1] = new Robot("Хантер", 800, 20);
        test[2] = new Human("Вова", 600, 40);
        test[3] = new Cat("Рыжик", 200, 30);
        test[4] = new Robot("j2", 900, 70);

        Wall wall[] = new Wall[WALLS];
        wall[0] = new Wall(20);
        wall[1] = new Wall(40);
        wall[2] = new Wall(10);
        Treadmill treadmill[] = new Treadmill[LENGTH];
        treadmill[0] = new Treadmill(200);
        treadmill[1] = new Treadmill(100);
        treadmill[2] = new Treadmill(300);
        for (int i = 0; i < MEMBERS; i++) {
            System.out.println();
            for (int w = 0; w < WALLS; w++)
                if (test[i].getTestJump() < wall[w].getWidth()) ;
            test[i].jumpWall(wall);
            for (int l = 0; l < LENGTH; l++)
                if (test[i].getTestRun() < treadmill[l].getLength()) ;
            test[i].runTreadmill(treadmill);
        }
    }
}