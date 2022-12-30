package level1.lesson6;

public class Animal implements Cloneable {
    protected String type;
    protected String name;
    protected int swims;
    protected int run;
    private static int count;

    public Animal() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        count++;
        return super.clone();
    }

    @Override
    public String toString() {
        return "Вид: '" + type + '\'' +
                ", Кличка: '" + name + "\' \n" +
                ", Может проплыть " + swims +
                ", Может пробежать " + run;
    }

    protected void run(int distance) {
        if (run >= distance) {
            System.out.println(this.type + " по кличке " + this.name + "  пробежал " + distance);
        } else {
            System.out.println(this.type + " по кличке " + this.name + " не добижал");
        }
    }

    protected void swim(int distance) {
        if (swims >= distance) {
            System.out.println(this.type + " по кличке " + this.name + " проплыл " + distance);
        } else {
            System.out.println(this.type + " по кличке " + this.name + " не проплыл");
        }
    }
}
