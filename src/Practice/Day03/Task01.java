package Practice.Day03;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите название города");
        String city = input.nextLine();
        while (!city.equals("STOP")) {

            switch (city) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    break;
                default:
                    System.out.println("Неизвестная страна");
                    break;
            }
            System.out.println("----------------------------------------------");
            System.out.println("Для продолжения работы введите название города");
            System.out.println("Для прекращения работы программы введите STOP");
            city = input.nextLine();
        }
        System.out.println("Программа завершила работу");
    }
}
