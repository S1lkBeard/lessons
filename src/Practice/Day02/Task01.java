package Practice.Day02;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("������� ����� ������");
        int number = input.nextInt();
        if (number > 0 && number <= 4) {
            System.out.println("��� ����������� ���");
        } else if (number > 4 && number <= 8) {
            System.out.println("��� ������������� ���");
        } else if (number > 9) {
            System.out.println("��� ������������� ���");
        } else {
            System.out.println("������ �����");
        }
    }
}
