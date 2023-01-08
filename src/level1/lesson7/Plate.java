package level1.lesson7;

public class Plate  {
    public int food;
    public Plate(int food){
        this.food=food;
    }
    public void info(){
    System.out.println("Всего еды "+food);
    }
    public void decreaseFood(int hunger) {
        food-=hunger;
    }
    public void increaseFood(int additive) {
        food+=additive;
    }
}
