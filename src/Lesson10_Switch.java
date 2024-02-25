import java.util.Scanner;

public class Lesson10_Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Введите возраст");
        int age = input.nextInt();
        if (age == 10) {
            System.out.println("Вы учитесь в школе");
        } else if (age == 18) {
            System.out.println("Вы совершеннолетний");
        }

        switch (age) {
            case 0:
                System.out.println("Вы родились");
                break;
            case 7:
                System.out.println("Вы пошли в школу");
                break;
            case 18:
                System.out.println("Вы совершеннолетний");
                break;
            default:  //default можно не писать
                System.out.println("Ни одно из предыдущих условий не подошло");
        }

        Scanner secondInput = new Scanner (System.in);
        System.out.println("Введите возраст");
        String stringAge = secondInput.nextLine();
        switch (stringAge) {
            case "0":
                System.out.println("Вы родились");
                break;
            case "7":
                System.out.println("Вы пошли в школу");
                break;
            case "18":
                System.out.println("Вы совершеннолетний");
                break;
            default:  //default можно не писать
                System.out.println("Ни одно из предыдущих условий не подошло");
        }
    }
}
