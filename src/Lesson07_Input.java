import java.util.Scanner;

public class Lesson07_Input {
    public static void main(String[] args) {
        String s = new String("s"); //избыточный способ

        Scanner input = new Scanner(System.in);
        System.out.println("Введите текст с клавиатуры");
        String string = input.nextLine();
        System.out.println("С клавиатуры был введен следующий текст: " + string);

        System.out.println("Введите целое число");
        int myInt = input.nextInt();
        System.out.println("Введенное целое число: " + myInt);

    }
}
