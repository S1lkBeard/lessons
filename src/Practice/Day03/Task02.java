package Practice.Day03;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите значение делимого");
        double a = input.nextDouble();
        System.out.println("Введите значение делителя");
        double b = input.nextDouble();
        double aB;
        while (!(b == 0)) {
            aB = a / b;
            System.out.println(aB);

            System.out.println("Введите значение делимого");
            a = input.nextDouble();
            System.out.println("Введите значение делителя");
            b = input.nextDouble();
        }
        System.out.println("Работа программы завершилась");
    }
}
