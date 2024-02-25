package Lessons.Lesson49_Enum;

public enum Animal {
    DOG("������"), CAT("�����"), FROG("�������");

    private String translation;

    //� enum ������������� ��������� ����������� ������� - Java �� ��������� �������� private
    Animal(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    public String toString() {
        return "������� �� ������� ����: " + translation;
    }
}
