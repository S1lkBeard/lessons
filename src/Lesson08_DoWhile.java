import java.util.Scanner;

public class Lesson08_DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("������� ����� 5");
        int value = input.nextInt();
        while (value != 5) {
            System.out.println("������� ����� 5");
            value = input.nextInt();
        }
        System.out.println("�� ����� ����� 5");

        Scanner secondInput = new Scanner(System.in);
        int secondValue;
        do {
            System.out.println("������� ����� 5");
            secondValue = input.nextInt();
        } while (secondValue != 5);
        System.out.println("�� ����� ����� 5");
    }
}
