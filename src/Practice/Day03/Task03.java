package Practice.Day03;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a;
        double b;
        double aB;
        for (int i = 0; i < 5; i++) {
            System.out.println("������� �������� ��������");
            a = input.nextDouble();
            System.out.println("������� �������� ��������");
            b = input.nextDouble();
            if (b == 0) {
                System.out.println("��������� ������� ������� �������� ��������");
                continue;
            }
            aB = a / b;
            System.out.println(aB);
        }
        System.out.println("������ ��������� �����������");
    }
}
