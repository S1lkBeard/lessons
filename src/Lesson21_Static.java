public class Lesson21_Static {
    public static void main(String[] args) {
        Lesson21_Human h1 = new Lesson21_Human("First", 20);
        Lesson21_Human.printNumberOfPeople();
        Lesson21_Human h2 = new Lesson21_Human("Third", 20);
        Lesson21_Human.printNumberOfPeople();

        //� static ���������� ���������� ���������� ����� �����, � �������� ��� �����������
        Lesson21_Human.description = "�������";
        Lesson21_Human.getDescription();

        //� �� ����� ������� ����� ������
        h1.description = "fdsf";
        h2.description = "qqqq";
        h1.getInfo();
        h2.getInfo();

        Lesson21_Human.getDescription();

        System.out.println(Math.pow(2, 4));
    }
}

class Lesson21_Human {

    //� ���� ���������� ������ ����� ����������, ������ ������ ������ ������� ������
    //� ���� ������ - ������ ��� ������ h1 (��. ����)
    private String name;
    private int age;

    //� ���� ���������� ������ ����� ���������� ����� �����, �������� ����������� ��� ���������� (��. ����)
    //� ����� ��� �� ����� ��������� ������ ������
    //static ��������, ��� ���������� ����������� �� �������� ������, � ������ ������
    //static ���������� ����� ��� ����� ������, � ���������� � ����� ����������
    //��� ��������, ��� � �������� (h1, h2, etc.) ������ Lesson21_Human �� ����� ���� ������ description
    public static String description;

    private static int countPeople;

    public Lesson21_Human(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name; //this ������������, ����� Java ����� �������� ����������, ��������� � �����, �� ����������, ����������� � ������
    }


    public void getInfo() {
        System.out.println("��� �������� - " + name + ", ��� ������� - " + age + " " + description);
    }

    //� static ������ ������ ���������� � ��-static ���������� - � ����� ������ ������������ ������
        public static void getInfoStatic() {
    //        System.out.println("��� �������� - " + name + ", ��� ������� - " + age + " " + description);
        }

    public static void getDescription() {
        System.out.println(description);
    }

    public static void printNumberOfPeople() {
        System.out.println("���������� ����� = " + countPeople);
    }
}