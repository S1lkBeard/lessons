package Lessons.Lesson27_Interfaces;

//����� ����� ����������� ����� ���������� �����������; � ����� ������ ���������� ������������� ����� �������
//�� ������������� ����� ������ �� ������ ������
public class Lesson27_Person implements Lesson27_Info {
    public String name;

    public Lesson27_Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("������!");
    }

    public void showInfo() {
        System.out.println("����������. ��� ��������: " + name);
    }
}
