package Lessons.Lesson46_48_Serialization;

import java.io.Serial;
import java.io.Serializable;
//��� ����, ����� ��������� ������� ������� ����� ���� ���������� � �����, ���������� ���������������� ��������� Serializable
public class Person implements Serializable {
    //���� ������� transient � ������������ ����, �� � ���� ����� ������� 0 ������ ���������� ��������
    private int id;
    //� ���������� ���� � ���� ������ ����� null
    private String name;
//    private transient String name;

    //serialVersionUID ������������ ��� �������� ������������;
    //��������, ����� ��� ������ ������ ������ Person, � ������� � ����.
    //c����� ����� ����� ��� �������������, � ��� ������� ������� ��������� ����� ����, ����� �������� ������
    //������������ � Java �� ���������, ������������� ������������� �� �����
//    @Serial
//    private static final long serialVersionUID = -3432423423543245345L;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return id + " : " + name;
    }
}
