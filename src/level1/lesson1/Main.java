package level1.lesson1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Решение задачи 4");
        System.out.print("\n введите фразу");
        String line =in.nextLine();
        System.out.print("\n Введите число ");
        int fis = in.nextInt();
        for(int i =0; i<fis;i++ ) {
            System.out.println(line);
        }
        System.out.print("Решение задачи 5");
        System.out.print("\n введите год");
        int year = in.nextInt();
        int ye = year%4;
        int gh = year%100;
        int gi = year%400;
        if(ye==0&&gh==0&&gi==0){
            System.out.print("true");
        }else {
            System.out.print("false");
        }
        System.out.print("\nРешение задачи 3");
        System.out.print("\nВведите число ");
        int digi = in.nextInt();
        if(digi>=0){
            System.out.println("false");
        }else {
            System.out.println("true");
        }
        System.out.print("Решение задачи 2");
        if(digi>=0){
            System.out.println("\nположительное");
        }else {
            System.out.println("\nотрицательное");
        }
        System.out.print("Решение задачи 1");
        System.out.print("\nВведите целое число ");
        int num = in.nextInt();
        System.out.print("Введите второе целое число ");
        int fig = in.nextInt();
        int suma= num+fig;
        if(suma > 10 && suma < 20){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        int sum = checkSumSign(4, 3);
        int colour = printColor(100);
        compareNumbers(2,5);
        printThreeWords("Orange","Banana","Apple");
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
        if (colour <= 0) {
            System.out.println("Красный");
        }
        if (colour <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static int checkSumSign(int a, int b) {
        return a + b;
    }
    public static int printColor(int value) {
        return value;
    }
    public static void compareNumbers(int a,int b){
        if(a >= b){
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
    public static void printThreeWords(String a,String b ,String c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
    Scanner in = new Scanner(System.in);

  }



