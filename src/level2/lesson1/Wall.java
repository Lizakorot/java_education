package level2.lesson1;

public class Wall {
    protected int width;
    public Wall (int width){
        this.width=width;
    }
    public void overcoming(int jump){
        width-=jump;
    }
}
