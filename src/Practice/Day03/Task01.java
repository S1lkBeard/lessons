package Practice.Day03;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("������� �������� ������");
        String city = input.nextLine();
        while (!city.equals("STOP")) {

            switch (city) {
                case "������":
                case "�����������":
                case "������":
                    System.out.println("������");
                    break;
                case "���":
                case "�����":
                case "�����":
                    System.out.println("������");
                    break;
                case "���������":
                case "���������":
                case "������":
                    System.out.println("������");
                    break;
                case "������":
                case "������":
                case "ʸ���":
                    System.out.println("��������");
                    break;
                default:
                    System.out.println("����������� ������");
                    break;
            }
            System.out.println("----------------------------------------------");
            System.out.println("��� ����������� ������ ������� �������� ������");
            System.out.println("��� ����������� ������ ��������� ������� STOP");
            city = input.nextLine();
        }
        System.out.println("��������� ��������� ������");
    }
}
