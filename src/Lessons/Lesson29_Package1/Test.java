package Lessons.Lesson29_Package1;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        //����� ���� ������ � ���������� nameTwo � ������������� default, ������ ��� ����� Test1 ��������� � ��� �� ������, ��� � ����� Person
        person.nameTwo = "Second";
        //� ���������� nameThree ��� ������� ���� �������� �� ��, ��� ������ ��������� � ����� ������ - ��-�� ������������ private
        //person.nameThree = "Third";
        System.out.println(person.nameFour);
    }
}