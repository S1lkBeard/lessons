package Lessons.Lesson30_Polymorphism;

public class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("������ ���");
    }

    public void bark() {
        System.out.println("������ ����");
    }
}
