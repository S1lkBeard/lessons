package Practice.Day02;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("������� ����� a");
        int a = input.nextInt();
        System.out.println("������� ����� b");
        int b = input.nextInt();
        System.out.println("����� � ��������� �� " + a + " �� " + b + ", ������� ������� �� 5 ��� ������� � �� 10 � ��������:");
        int i = a;
        while (i <= b) {
            if ((i % 5 == 0) && !(i % 10 == 0)) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
