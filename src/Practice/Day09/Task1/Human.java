package Practice.Day09.Task1;

public class Human {
//    private String name;
    //���������� name ��������������� ��� protected ��� ����, ����� ������-���������� ����� ���������� � ���� ����������
    protected String name;

    public Human(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println("��� �������� - " + name);
        return name;
    }

    public void printInfo() {
        System.out.println("���� ������� � ������ " + name);
    }
}
