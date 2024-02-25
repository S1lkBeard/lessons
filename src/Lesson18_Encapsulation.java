import java.util.Scanner;

public class Lesson18_Encapsulation {
    public static void main(String[] args) {
        Lesson18_Person personOne = new Lesson18_Person();

        Scanner input = new Scanner(System.in);
        System.out.println("Введите свое имя");
        String name = input.nextLine();
        personOne.setName(name);

        //или
        personOne.setName(input.nextLine());

//        int age = input.nextInt();
        personOne.setAge(20);

        System.out.println(personOne.getName() + " " + personOne.getAge());
        personOne.calculateYearsOfRetirementVoid();
    }
}

class Lesson18_Person {
    private String name; //инкапсуляция - доступ к переменным нужно осуществлять через сеттеры и геттеры
    private int age;

    public void setName(String username) {
        if (username.isEmpty()) {
            System.out.println("Вы не ввели имя");
        } else {
            name = username;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if (userAge < 0) {
            System.out.println("Вы не ввели возраст");
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
        System.out.println("Человеку по имени " + name + " возрастом " + age + " до пенсии осталось " + years);
    }
}
