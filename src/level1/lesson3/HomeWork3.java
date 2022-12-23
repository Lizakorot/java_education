package level1.lesson3;
import java.util.*;


public class HomeWork3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 0, 0, 1, 0, 1, 1};
        int[] problem1=arry1(arr1);
        System.out.print(Arrays.toString(problem1));
        int[]arr2 = new int[100];
        int[] problem2 = arry2(arr2);
        System.out.print("\n"+Arrays.toString(problem2));
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[] problem3 = arry3(arr3);
        System.out.print("\n"+Arrays.toString(problem3) + "\n");
        int[][] arr4 = new int[3][3];
        int[][] problem4 = arry4(arr4);
        //System.out.print(Arrays.toString(problem4));
        int len =10;
        int initialValue = 3;
        int []arr5 = new int [len];
        int[] problem5 = arry5(arr5,initialValue);
        System.out.print(Arrays.toString(problem5));
        int[] arr6 = {2, 3, 4, 56, 32, 5, 7, 31, 5};
        int[] problem6 = arry6(arr6);
        int[] arr7 = {1, 1, 1, 2, 1};
        boolean problem7 = arry7(arr7);
        if (problem7 == true) {
            System.out.println("\n" + "true");
        } else {
            System.out.println("\n" + "false");
        }
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] arr8 = {0, 0, 0, 0, 0, 0, 0};
        int[] problem8 = arry8(arr,arr8);
        System.out.println(Arrays.toString(arr8));
    }

    public static int[] arry1(int [] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr1[i] = 1;
            } else {
                arr1[i] = 0;
            }
        }
        return arr1;
    }

    public static int[] arry2(int [] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=i+1;
        }
        return arr2;
    }

    public static int[] arry3(int []arr3) {
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        return arr3;
    }

    public static int[][] arry4(int[][]arr4) {
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

    public static int[] arry5(int[] arr5, int initialValue) {
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = initialValue;
        }
        return arr5;
    }

    public static int[] arry6(int []arr6) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
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

    public static boolean arry7(int []arr7) {
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

    public static int[] arry8 (int[]arr,int[]arr8) {
        Scanner in = new Scanner(System.in);
        System.out.print("\n" + " Введите число");
        int n = in.nextInt();
        int a = arr.length-n;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr8));
            System.arraycopy(arr, n, arr8, 0, a);
            System.arraycopy(arr, 0, arr8, a, n);
        return arr;
    }

}
