package Lessons.Lesson33_UpcastingDowncasting;

public class Test {
    public static void main(String[] args) {

        //Upcasting - ���������� �������������� (�� ���������� � ��������), �.�. � �������� ������������ ����� Dog ����, ��� Animal
        Animal animal = new Dog();
        //���
        Dog dog1 = new Dog();
        Animal animal1 = dog1;
        //Upcasting ���������� ������, �.�. ��� ������ �������

        //Downcasting - ���������� �������������� (�� ���������� � ��������), �.�. � �������� ������������ ����� Dog ����, ��� Animal
        Dog dog2 = (Dog) animal1; //����� ��������������
        dog2.bark();

        Animal a = new Animal();
        Dog b = (Dog) a;
        b.bark();
    }
}
