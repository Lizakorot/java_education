package level2.lesson1;

public class Treadmill {
    protected int  length;
    public Treadmill(int length){
        this.length=length;
    }

    public int getLength() {
        return length;
    }
    public void distance(int run){
        length-=run;
    }
}
