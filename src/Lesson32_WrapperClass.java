public class Lesson32_WrapperClass {
    public static void main(String[] args) {
        int x1 = 1;
        System.out.println(x1);

        Integer x2 = new Integer(123); //������������ �����������, �.�. ����� ������ ���������
        x2.compareTo(125);
        Integer.parseInt("123");

        Integer x3 = 123; //������������
        int y = x3; //��������������

        //������-������ - Double, Float, Long, Integer, Short, Byte, Character � Boolean. �������� �������� �� ��������� �����
    }
}
