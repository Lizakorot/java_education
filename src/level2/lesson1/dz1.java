package level2.lesson1;

public class dz1 {
    public static void main(String[] args) {
        Cat cat = new Cat("барсик",200,9);
        Robot robot = new Robot("робоот",100,7);
        Human human = new Human("человек",300,10);
        Wall well = new Wall(9);
        Treadmill treadmill= new Treadmill(300);
        cat.barrier(well);cat.Jog(treadmill);
        robot.barrier(well); robot.jog(treadmill);
        human.barrier(well);human.jog(treadmill);




    }
}