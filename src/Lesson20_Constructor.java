public class Lesson20_Constructor {
    public static void main(String[] args) {
        Lesson20_Human humanOne = new Lesson20_Human();
        humanOne.getInfo();

        Lesson20_Human humanTwo = new Lesson20_Human("HumanTwo");
        humanTwo.getInfo();

        Lesson20_Human humanThird = new Lesson20_Human("HumanTwo", 20);
        humanThird.getInfo();
    }
}

class Lesson20_Human {

    private String name;
    private int age;

    //� Java ����� ����� ������ � ����������� �������, ���� ��� ��������� ������ ���������
    //��� ���������� "����������� ������"
    public Lesson20_Human() {
        System.out.println("������ �� ������� ������������");
        this.name = "��� �� ���������";
        this.age = 0;
    }

    public Lesson20_Human(String name) {
        System.out.println("������ �� ������� ������������");
        this.name = name;
    }

    public Lesson20_Human(String name, int age) {
        System.out.println("������ �� �������� ������������");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name; //this ������������, ����� Java ����� �������� ����������, ��������� � �����, �� ����������, ����������� � ������
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println("��� �������� - " + name + ", ��� ������� - " + age);
    }
}