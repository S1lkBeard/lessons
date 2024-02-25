package Practice.Day04;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("������� ������ �������");
        double[] msv1 = new double[input.nextInt()];

        byte countNumbersGreaterThanEight = 0;
        byte countNumbersEqualToOne = 0;
        byte countNonOddNumbers = 0; //������ �����
        byte countOddNumbers = 0; //�������� �����
        double sumOfMsv1 = 0;

        for (int i = 0; i < msv1.length; i++) {
            msv1[i] = Math.round(Math.random() * 10);
            sumOfMsv1 = sumOfMsv1 + msv1[i];
            System.out.printf("%.1f ", msv1[i]);

            if (msv1[i] > 8) {
                countNumbersGreaterThanEight++;
            }
            if (msv1[i] == 1) {
                countNumbersEqualToOne++;
            }
            if (msv1[i] % 2 == 0) {
                countNonOddNumbers++;
            }
            if (!(msv1[i] % 2 == 0)) {
                countOddNumbers++;
            }
        }
        System.out.println();
        System.out.println("������ ������� msv1 ����� " + msv1.length);
        System.out.println("���������� �����, ������ 8 ����� " + countNumbersGreaterThanEight);
        System.out.println("���������� �����, ������ 1 ����� " + countNumbersEqualToOne);
        System.out.println("���������� ������ ����� ����� " + countNonOddNumbers);
        System.out.println("���������� �������� ����� ����� " + countOddNumbers);
        System.out.println("����� ���� ��������� ������� �����" + sumOfMsv1);
    }
}
