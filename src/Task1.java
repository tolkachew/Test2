import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String arr[] = new String[a];
        for (int i = 1; i <= a; i++) {
            for (int j = 0; j < a-i; j++)
                System.out.print(" ");
            for (int j = 0; j < i; j++)
                    System.out.print("*" + " ");
            System.out.println();
        }
    }
}
/*
Контрольная работа:
1. Вывести паттерн в виде треугольника заданной высоты:
            *
           *  *
          *    *
 */