public class Lesson09_BreakContinue {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i == 15) {
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("����� �� �����");

        for (int x = 0; x <= 15; x++) {
            if (x % 2 == 0) {
                continue;  //��, ��� ��� ����� continue �� �����������
            }
            System.out.println("��� �������� �����: " + x);
        }
    }
}
