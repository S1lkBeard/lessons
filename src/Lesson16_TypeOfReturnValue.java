public class Lesson16_TypeOfReturnValue {
    public static void main(String[] args) {
        Lesson16_Person personOne = new Lesson16_Person();
        personOne.name = "First";
        personOne.age = 20;
        personOne.calculateYearsOfRetirementVoid();
        int years = personOne.calculateYearsOfRetirement();
        System.out.println(years);
    }
}

class Lesson16_Person {
    String name;
    int age;

    void calculateYearsOfRetirementVoid() {
        int years = 65 - age;
        System.out.println("�� ������ �������� " + years);
    }

    int calculateYearsOfRetirement() {
        int years = 65 - age;
        return years; //����� return ����� ���������� ���� ������
        //������� ����� �������� ������ ���� �� ����, ������������ � ����� ������
    }
}
