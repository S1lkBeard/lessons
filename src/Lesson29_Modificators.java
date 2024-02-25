import Lessons.Lesson29_Package1.Person;

public class Lesson29_Modificators {
    public int id1;
    private int id2;
    int id3; //default
    protected int id4;

    public static void main(String[] args) {
        //public, private, default, protected
        //public - ��������� ������ � ������/������/����
        //private - ��������� ������ � ������/����, �� �� � ������ - ����� �� ����� ���� private
        //default - ��������������� �� ���������, ���� �� ��� ������ ����� ������
        //��� default ������� �������� � �������� ������ ������
        //protected ������� �������� � �������� ������ ������, � ��� �� ���� ����������
        //

        Person person = new Person();
        person.nameOne = "First";
        //� nameTwo ��� �������, ������ ��� � �� ����������� default ������ public
        //person.nameTwo = "Second";
        //� nameFour ��� �� ��� �������, �� ��-�� ����������� protected
        //person.nameFour = "Four";
    }

    private void technicalMethod() {

    }
}
