package level1.lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    //Создание игрового поля
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOT_WIN = 3;
    //Ячейки  поля
    public static final char DOT_empty='*';
    public static final char DOT_X ='X';
    public static final char DOT_Y='O';
    public static final Scanner in = new Scanner(System.in);
    public static final Random random = new Random();
    public static void main(String[] args) {
        initmap();
        printmap();
        while (true){
            movehuman();
            printmap();
            if(checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            movecomputer();
            if (checkWin(DOT_Y)){
                System.out.println("Победил компьютер");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }
    // Проверка победы
    public static boolean checkWin(char symb) {
        if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
        if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
        if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
        return false;
    }
    //Проверка заполниения поля
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_empty) return false;
            }
        }
        return true;
    }
    //Ход человека
    public static void movehuman() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = in.nextInt() - 1;
            y = in.nextInt() - 1;
        } while (!isCellValid(x,y));
            map[x][y] = DOT_X;
    }
    //Проверка ячеек
    public static boolean isCellValid(int x, int y){
        if(x<0||x>=SIZE||y<0||y>=SIZE)return false;
        if (map[y][x] == DOT_empty)return true;
        return false;
    }
    //Ход комп.
    public static void movecomputer(){
        int x,y;
        do{
            x=random.nextInt();
            y=random.nextInt();
        }while (!isCellValid(x,y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_Y;
    }
// Инициализация поля
    public static void  initmap(){
        map = new char[SIZE][SIZE];
        for (int i = 0;i<SIZE;i++){
            for (int j = 0;j<SIZE;j++){
                map[i][j]= DOT_empty;
            }
        }
    }
    //Вывод поля в консоль
    public static void printmap(){
        for (int i =0;i<=SIZE;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 0;i<SIZE;i++){
            System.out.print((i+1)+" ");
            for (int j=0;j<SIZE;j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
