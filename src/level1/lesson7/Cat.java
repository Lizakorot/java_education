package level1.lesson7;

public class Cat {
    public String name;
    public int hunger;
    public boolean satiety;


    public Cat(String name, int hunger, boolean satiety) {
        this.name = name;
        this.hunger = hunger;
        this.satiety =satiety;
    }
    public void Eat(Plate plate){
            plate.DecreaseFood(hunger);
    }
}
