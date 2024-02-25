public class Lesson36_AnonymousClasses {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        OtherAnimals otherAnimal = new OtherAnimals();
        otherAnimal.eat();

        //����������� ���� ���������� ���������� "��������� ������" - ����� ������������, ����� ����� �������������� ����� ������
        //�� ��� ���� �� ������� ��������� ��������� ����������� �����
        Animal animal2 = new Animal() {
            //� ������� ����� ����������� ��������� ��������� ����� (��������� ���������), ������� ����������� �� ��������
            public void eat() {
                System.out.println("�������� �� ���������� ������ ���");
            }
        };
        animal2.eat();

        //���������� ����� ������� � ��� ����������
        AnimalsInterface animalsFromInterface = new AnimalsInterface() {
            public void eat() {
                System.out.println("�������� �� ���������� ���");
            }
        };
        animalsFromInterface.eat();
    }
}

class Animal {
    public void eat() {
        System.out.println("�������� ���");
    }
}

class OtherAnimals extends Animal {
    public void eat() {
        System.out.println("������ �������� ���");
    }
}

interface AnimalsInterface {
    public void eat();
}