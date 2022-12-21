package level1.lesson2;
import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Решение задачи 4");
        System.out.print("\n введите фразу");
        String line = in.nextLine();
        System.out.print(" Введите число ");
        int fis = in.nextInt();
        String problem3 = task4(fis,line);
            System.out.println(line);
        System.out.print("Решение задачи 5");
        System.out.print("\n введите год");
        int year = in.nextInt();
        boolean problem4 = task5(year);
            System.out.print(problem4);
        System.out.print("\nРешение задачи 3");
        System.out.print("\nВведите число ");
        int digi = in.nextInt();
        boolean problem2 = task3(digi);
        if (problem2 ==true) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
        System.out.print("Решение задачи 2");
        System.out.print("\nВведите число ");
        int dig = in.nextInt();
        boolean problem1 = task2(dig);
        if (problem1 ==true) {
            System.out.println("\nположительное");
        } else {
            System.out.println("\nотрицательное");
        }
        System.out.print("Решение задачи 1");
        System.out.print("\nВведите целое число ");
        int num = in.nextInt();
        System.out.print("Введите второе целое число ");
        int fig = in.nextInt();
        boolean problem = task1(num, fig);
        if (problem == true) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean task1(int value1, int value2) {
        int suma = value1 + value2;
        if (suma > 10 && suma < 20) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean task2(int tally) {
        if (tally >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean task3(int tally1) {
        if (tally1>=0){
            return true;
        }else {
            return false;
        }
    }
    public static String task4(int tally2, String line){
        for (int i = 0; i < tally2; i++) {
            System.out.println(line);
        }
        return line;
    }
    public static boolean task5(int tally3){
        int ye = tally3 % 4;
        int gh = tally3 % 100;
        int gi = tally3 % 400;
        if (ye == 0 && gh == 0 && gi == 0) {
            return true;
        } else {
            return false;
        }
    }
}
