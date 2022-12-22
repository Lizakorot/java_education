package level1.lesson3;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class HomeWork3 {
    public static void main(String[] args) {
        int[] problem = Arry1();
        int[] problem1 = Arry2();
        int[] problem2 = Arry3();
        int[][] problem3 = Arry4();
        int[] problem5 = Arry5();
        int[] problem6 = Arry6();
        boolean problem7 = Arry7();
        if (problem7 == true) {
            System.out.println("\n" + "true");
        } else {
            System.out.println("\n" + "false");
        }
        int[] problem8 = Arry8();

    }

    public static int[] Arry1() {
        int[] arr1 = {1, 0, 0, 1, 0, 1, 1};
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr1[i] = 1;
            } else {
                arr1[i] = 0;
            }
        }
        System.out.print(Arrays.toString(arr1));
        return arr1;

    }

    public static int[] Arry2() {
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            while (arr2[i] < 100) {
                arr2[i]++;
                System.out.print("\n" + arr2[i] + "\n");
            }
            break;
        }
        return arr2;
    }

    public static int[] Arry3() {
        int y = 0;
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        System.out.print(Arrays.toString(arr3) + "\n");
        return arr3;
    }

    public static int[][] Arry4() {
        int[][] arr4 = new int[3][3];
        for (int i = 0; i < 3; i++) {
            arr4[i][i] = 1;
            arr4[i][arr4.length - 1 - i] = 1;
        }
        for (int[] a : arr4) {
            for (int b : a) {
                System.out.print(b);
            }
            System.out.println();
        }
        return arr4;
    }

    public static int[] Arry5() {
        Scanner in = new Scanner(System.in);
        System.out.print("\n" + " Введите кол-во элементов");
        int len = in.nextInt();
        int[] arr5 = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.print(" Введите" + (i + 1) + "-й элемент массива:");
            int initialValue = in.nextInt();
            arr5[i] = initialValue;
        }
        System.out.print(Arrays.toString(arr5));
        return arr5;
    }

    public static int[] Arry6() {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[] arr6 = {2, 3, 4, 56, 32, 5, 7, 31, 5};
        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] > max) {
                max = arr6[i];
            }
            if (arr6[i] < min) {
                min = arr6[i];
            }
        }
        System.out.println("\n" + "Минимальный элемент: " + min + "\n" + "Максимальный элемент: " + max);
        return arr6;
    }

    public static boolean Arry7() {
        int[] arr7 = {1, 1, 1, 2, 1};
        int left = 0;
        int right = Arrays.stream(arr7).sum();
        for (int i = 0; i < arr7.length; i++) {
            if (left == right) {
                return true;
            }
            left += i;
            right -= i;
        }
        return true;
    }

    public static int[] Arry8 () {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] arr1 = {0, 0, 0, 0, 0, 0, 0};
        Scanner in = new Scanner(System.in);
        System.out.print("\n" + " Введите число");
        int n = in.nextInt();
        int a = arr.length-n;
        int d = Math.abs(a);
        int b = Math.abs(n);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
            System.arraycopy(arr, n, arr1, 0, a);
            System.arraycopy(arr, 0, arr1, a, n);
        System.out.println(Arrays.toString(arr1));
        return arr;
    }

}
