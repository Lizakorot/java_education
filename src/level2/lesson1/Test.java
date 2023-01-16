package level2.lesson1;

public abstract class Test {
    private String name;
    private int testRun;
    private int testJump;
    Test(String name,  int testRun, int testJump){
        this.name=name;
        this.testJump=testJump;
        this.testRun=testRun;
    }

    public String getName() {
        return name;
    }

    public int getTestRun() {
        return testRun;
    }

    public int getTestJump() {
        return testJump;
    }

    public void runTreadmill(Treadmill[] treadmill) {

    }

    public void jumpWall(Wall[] wall) {

    }
}
