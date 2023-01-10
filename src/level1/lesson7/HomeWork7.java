package level1.lesson7;

import java.util.Scanner;

public class HomeWork7  {
public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Cat [] cats = new Cat[5];
        cats [0]=new Cat("барсик",3,false);
        cats [1]=new Cat("рыжик",8,false);
        cats [2]=new Cat("золонд",4,false);
        cats [3]=new Cat("бурик",1,false);
        cats [4]=new Cat("ханфея",6,false);
            System.out.println("кол-во еды в миске");
            Plate plate = new Plate(15);
            plate.info();
            for (int i = 0;i<cats.length;i++) {
                if (cats[i].satiety == false && cats[i].hunger < plate.food) {
                    cats[i].eat(plate);
                    cats[i].satiety = true;
                    System.out.println(cats[i].name + " сытость "+ true);
                } else {
                    System.out.println(cats[i].name + " не поел");
                }
            }
            plate.info();
            System.out.println("сколько еды добавить ");
            int feed= sc.nextInt();
            plate.increaseFood(feed);
            plate.info();
        }
    }
