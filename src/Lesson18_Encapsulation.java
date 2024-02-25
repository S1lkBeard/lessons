import java.util.Scanner;

public class Lesson18_Encapsulation {
    public static void main(String[] args) {
        Lesson18_Person personOne = new Lesson18_Person();

        Scanner input = new Scanner(System.in);
        System.out.println("������� ���� ���");
        String name = input.nextLine();
        personOne.setName(name);

        //���
        personOne.setName(input.nextLine());

//        int age = input.nextInt();
        personOne.setAge(20);

        System.out.println(personOne.getName() + " " + personOne.getAge());
        personOne.calculateYearsOfRetirementVoid();
    }
}

class Lesson18_Person {
    private String name; //������������ - ������ � ���������� ����� ������������ ����� ������� � �������
    private int age;

    public void setName(String username) {
        if (username.isEmpty()) {
            System.out.println("�� �� ����� ���");
        } else {
            name = username;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("�� �� ����� �������");
        } else {
            age = userAge;
        }
    }

    public int getAge() {
        return age;
    }

    void setNameAndAge(String username, int userAge) {
        name = username;
        age = userAge;
    }

    void calculateYearsOfRetirementVoid() {
        int years = 65 - age;
        System.out.println("�������� �� ����� " + name + " ��������� " + age + " �� ������ �������� " + years);
    }
}
