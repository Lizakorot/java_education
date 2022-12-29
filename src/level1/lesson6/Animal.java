package level1.lesson6;

public class Animal implements Cloneable {
    protected String type;       // вид животного (наименование класса эт. хорошо но оно видно только программе)
    protected String name;       // имя или кличка животного (если есть)
    protected int swims;         // возможность животного плавать    (численная характеристика, метры непрерывного интенсивного плавания)
    protected int run;           // возможность животного бегать     (численная характеристика, метры непрерывного быстрого бега)
    private static int count;    // счетчик количества созданных животных (в том числе клонированных) не стал тут разделять.

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
