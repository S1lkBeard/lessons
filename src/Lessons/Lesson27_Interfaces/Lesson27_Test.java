package Lessons.Lesson27_Interfaces;

public class Lesson27_Test {
    public static void main(String[] args) {
        Lesson27_Animal animal = new Lesson27_Animal(1);

        Lesson27_Person person = new Lesson27_Person("���������");

        animal.sleep();
        person.sayHello();
        animal.showInfo();
        person.showInfo();

        //��, ��� ��� ���� ��������� � ������������
        //��� ����� ������ ������ � ������, ���� ����� � ��������� �������
        Lesson27_Info info1 = new Lesson27_Animal(2);
        Lesson27_Info info2 = new Lesson27_Person("������");

        //� �������� ����������� ����� ������� ������ �� ������, ������� ���� � ����������
        //�, ��������������, � ���������������� �������
        info1.showInfo();
        info2.showInfo();

        outputInfo(info1);
        outputInfo(info2);
        //� ����� outputInfo ����� ������ �� ������ ������ ���������� Lesson27_Info
        //�� � ������� ���������������� �������
        outputInfo(animal);
        outputInfo(person);
    }

    public static void outputInfo(Lesson27_Info info) {
        info.showInfo();
    }
}
