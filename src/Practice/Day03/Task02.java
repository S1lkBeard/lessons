package Practice.Day03;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("������� �������� ��������");
        double a = input.nextDouble();
        System.out.println("������� �������� ��������");
        double b = input.nextDouble();
        double aB;
        while (!(b == 0)) {
            aB = a / b;
            System.out.println(aB);

            System.out.println("������� �������� ��������");
            a = input.nextDouble();
            System.out.println("������� �������� ��������");
            b = input.nextDouble();
        }
        System.out.println("������ ��������� �����������");
    }
}
