public class Lesson26_Dog extends Lesson26_Animal {
    public void bark() {
        System.out.println("������ ����");
    }

    //��������� @Override ����� ������, ����� �� ������
    //@Override
    public void eat() {
        System.out.println("������ ���");
    }

    public void showName() {
        System.out.println("��� ������ - " + name);
    }
}
