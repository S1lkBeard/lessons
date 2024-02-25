package Practice.Day02;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число этажей");
        int number = input.nextInt();
        if (number > 0 && number <= 4) {
            System.out.println("Это малоэтажный дом");
        } else if (number > 4 && number <= 8) {
            System.out.println("Это среднеэтажный дом");
        } else if (number > 9) {
            System.out.println("Это высокоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
