import java.util.Scanner;

public class Lesson10_Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("������� �������");
        int age = input.nextInt();
        if (age == 10) {
            System.out.println("�� ������� � �����");
        } else if (age == 18) {
            System.out.println("�� ����������������");
        }

        switch (age) {
            case 0:
                System.out.println("�� ��������");
                break;
            case 7:
                System.out.println("�� ����� � �����");
                break;
            case 18:
                System.out.println("�� ����������������");
                break;
            default:  //default ����� �� ������
                System.out.println("�� ���� �� ���������� ������� �� �������");
        }

        Scanner secondInput = new Scanner (System.in);
        System.out.println("������� �������");
        String stringAge = secondInput.nextLine();
        switch (stringAge) {
            case "0":
                System.out.println("�� ��������");
                break;
            case "7":
                System.out.println("�� ����� � �����");
                break;
            case "18":
                System.out.println("�� ����������������");
                break;
            default:  //default ����� �� ������
                System.out.println("�� ���� �� ���������� ������� �� �������");
        }
    }
}
