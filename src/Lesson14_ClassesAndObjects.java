public class Lesson14_ClassesAndObjects {
    public static void main(String[] args) {
        Person personOne = new Person();
        personOne.name = "First";
        personOne.age = 20;
        System.out.println("���� ����� " + personOne.name + " � ��� " + personOne.age + " ���");

        Person personTwo = new Person();
        personTwo.name = "Second";
        personTwo.age = 20;
        System.out.println("���� ����� " + personTwo.name + " � ��� " + personTwo.age + " ���");
    }
}

class Person {
    //� ������ ����� ����:
    //1. ������ (����)
    //2. ��������, ������� �� ����� ��������� (������)

    String name;
    int age;
}
