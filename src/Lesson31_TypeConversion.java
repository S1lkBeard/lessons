public class Lesson31_TypeConversion {
    public static void main(String[] args) {
        int q = 32;
        short w = 143;

        double t = 432.4;
        int n = (int) t;
        System.out.println(n);

        float a = 123.2f; //����� ������� ����� �� ��������� �������� double; ������� ��� float ���������� ������� f ��� F
        long s = 3242343L; //����� ����� �� ��������� �������� integer, ������� ��� ����� �������� �������� ���������� ������; ������� ��� long ���������� ������� l ��� L

        long b = q; //������� ���������� ����
        int z = (int) s; //����� ���������� ����

        byte e = (byte) 128; //-128 �� 127
        System.out.println(e); //����� - -128

    }
}
