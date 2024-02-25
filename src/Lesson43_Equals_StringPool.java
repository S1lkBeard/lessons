public class Lesson43_Equals_StringPool {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        System.out.println(x == y);

        Lesson43_Animal animal1 = new Lesson43_Animal(1);
        Lesson43_Animal animal2 = new Lesson43_Animal(1);
        //������ == ���������� ������ �� �������
        System.out.println(animal1 == animal2);
        System.out.println(animal1.equals(animal2));

        String string1 = "Hello";
        String string2 = "Hello";
        System.out.println(string1.equals(string2));
        //� ������� �� ��������� ���� �������� ������ Lesson43_Animal, ��������� ���������� ����� ���� ������������� ��������� - ��������� StringPool
        //��� ����������, ������ ��� ��� �������� ���� �������� ������ String, Java �� �������� ������ ��� ������ ������, � ����� � ������ � ���� �� �������
        //������� ��� ��������� � ������� == �������� ������������� ���������, ������ ��� ������ �� ������� �����
        System.out.println(string1 == string2);
        //�� ���� ������� ������� ������ String ��������� ���� ��������, �� �������� StringPool �� ���������� � ������
        String string3 = new String("Hello");
        String string4 = new String("Hello");
        System.out.println(string3 == string4);
    }
}

class Lesson43_Animal {
    private int id;

    public Lesson43_Animal (int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        Lesson43_Animal otherAnimal = (Lesson43_Animal) obj;
        return this.id == otherAnimal.id;
    }
}
