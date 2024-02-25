package Practice.Day03;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a;
        double b;
        double aB;
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите значение делимого");
            a = input.nextDouble();
            System.out.println("Введите значение делителя");
            b = input.nextDouble();
            if (b == 0) {
                System.out.println("Результат деления текущей итерации пропущен");
                continue;
            }
            aB = a / b;
            System.out.println(aB);
        }
        System.out.println("Работа программы завершилась");
    }
}
