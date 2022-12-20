package level1.lesson1;

public class Main {
    public static void main(String[] args) {
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
  }


