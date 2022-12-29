package level1.lesson6;

public class Cat extends Animal {
    private static int count;

    public Cat(String type, String name, int run) {
        this.type = type;
        this.name = name;
        this.run = run;
        count++;
    }

    static int getSwims() {
        System.out.println("Кошки не плавыют");
        return 0;
    }

    public static int getCount() {
        return count;
    }

}

