public class Lesson06_If {
    public static void main(String[] args) {
        if (5 == 5) {
            System.out.println("��, �����");
        }

        if (5 > 1) {
            System.out.println("��, �����");
        }

        if (5 < 4) {
            System.out.println("��, �����");
        } else {
            System.out.println("���, �������");
        }

        int myInt = 15;
        if (myInt < 10) {
            System.out.println("���, �������");
        } else if (myInt > 20) {
            System.out.println("���, �������");
        }

        int mySecondInt = 15;
        if (mySecondInt < 10) {
            System.out.println("���, �������");
        } else if (mySecondInt > 20) {
            System.out.println("���, �������");
        } else {
            System.out.println("�� ���� �� ���������� �������");
        }

        int myThirdInt = 5;
        if (myThirdInt < 10) {
            System.out.println("��, �����");
        } else if (myThirdInt < 20) {
            System.out.println("��, �����");
        }
    }
}
