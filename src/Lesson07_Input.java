import java.util.Scanner;

public class Lesson07_Input {
    public static void main(String[] args) {
        String s = new String("s"); //���������� ������

        Scanner input = new Scanner(System.in);
        System.out.println("������� ����� � ����������");
        String string = input.nextLine();
        System.out.println("� ���������� ��� ������ ��������� �����: " + string);

        System.out.println("������� ����� �����");
        int myInt = input.nextInt();
        System.out.println("��������� ����� �����: " + myInt);

    }
}
