package level1.lesson7;

public class Plate {
    public int food;

    public Plate(int food) {
        this.food = food;
    }

    public void Info() {
        System.out.println("Всего еды " + food);
    }

    public void DecreaseFood(int hunger) {
        food -= hunger;
    }

    public void IncreaseFood(int additive) {
        food += additive;
    }
}
