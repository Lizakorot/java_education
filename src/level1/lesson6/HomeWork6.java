package level1.lesson6;

public class HomeWork6 {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat("Кот ", "Мурзик");
        animals[1] = new Cat("Кошка ", "Алиса");
        animals[2] = new Dog("Собака ", "Наг");
        animals[3] = new Dog("Собака", "Лора");
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
        System.out.println("Всего котов создано: " + Cat.getCount());
        System.out.println("Всего собак создано: " + Dog.getCount());
        System.out.println("Всего животных создано: " + Animal.getCount());
        System.out.println();
        System.out.println("Бег: ");

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].type+animals[i].name+" "+animals[i].run);
        }
        System.out.println();
        System.out.println(Cat.getSwims());
        System.out.println("Плавание: ");

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].type+animals[i].name+" "+animals[i].swims);
        }
    }
}
