package Lessons.Lesson27_Interfaces;

//����� ����� ����������� ����� ���������� �����������; � ����� ������ ���������� ������������� ����� �������
//�� ������������� ����� ������ �� ������ ������
public class Lesson27_Animal implements Lesson27_Info {
    public int id;

    public Lesson27_Animal(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("�������� ����");
    }

    public void showInfo() {
        System.out.println("����������. ����� ���������: " + id);
    }
}
