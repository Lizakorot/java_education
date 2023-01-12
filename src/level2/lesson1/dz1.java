package level2.lesson1;

public class dz1 {
    public static void main(String[] args) {
        Cat cat = new Cat("барсик");
        Robot robot = new Robot("fhg");
        Human human = new Human("hf");
        Wall well = new Wall(30);
        Treadmill treadmill= new Treadmill(499);
        System.out.println(robot.toString()+"\n"+cat.toString()+"\n"+human.toString());
        if (robot.jump >= well.width) {
            System.out.println(robot.name+" Перепрыгнул");
        } else {
            System.out.println(robot.name+" Не перепрыгнул");
        }
        if (cat.jump >= well.width) {
            System.out.println(cat.name+" Перепрыгнул");
        } else {
            System.out.println(cat.name+" Не перепрыгнул");
        }
        if (human.jump >= well.width) {
            System.out.println(human.name +" Перепрыгнул");
        } else {
            System.out.println(human.name +" Не перепрыгнул");
        }
        if (robot.run>=treadmill.length){
            System.out.println(robot.name+ " Добежал");
        }else {
            System.out.println(robot.name+" Не добежал");
        }
        if (cat.run>=treadmill.length){
            System.out.println(cat.name+" Добежал");
        }else {
            System.out.println(cat.name+" Не добежал");
        }
        if (human.run>=treadmill.length){
            System.out.println(human.name+" Добежал");
        }else {
            System.out.println(human.name+" Не добежал");
        }
        cat.barri(well);
        human.barr(well);
        robot.barrier(well);
        cat.tra(treadmill);
        human.trac(treadmill);
        robot.track(treadmill);
    }
}