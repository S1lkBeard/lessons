package Lessons.Lesson35_Wildcards;

public class Animal {
    private int id;
    //���� ���� �����, ������� ����������� �� ��������, � � ������������ ������ ���� ������������� �����������
    //�� ��� ������������ � ������������ ������ ������ �������������� ����������� �� ���������
    public Animal() {
    }

    public Animal(int id) {
        this.id = id;
    }

    public void eat() {
        System.out.println("�������� ���");
    }

    public String toString() {
        return String.valueOf(id);
    }
}
