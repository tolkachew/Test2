import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество монет: ");
        int a = sc.nextInt();
        int n = 6;
        int[] arr = {50, 20, 10, 5, 2, 1};
        System.out.print("Ваша сдача номиналами: ");
        for (int i = 0; i < n; i++) {
            if (a == 0)
                break;
            while (a - arr[i] >= 0) {
                a -= arr[i];
                System.out.print(arr[i]+ " ");
            }
        }
    }
}

/*
2. Номиналы белорусских монет: 1,2,5,10,20,50.
Дана сумма сдачи: 51..99 копеек.
Выдать сдачу минимальным количеством монет.
 */