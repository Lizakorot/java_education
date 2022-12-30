package level1.lesson6;

public class Dog extends Animal {
    private static int count;

    public Dog(String type, String name) {
        this.type = type;
        this.name = name;
        this.swims = 10;
        this.run = 500;
        count++;
    }

    public static int getCount() {
        return count;
    }
}