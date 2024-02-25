public class Lesson17_ParametersOfMethod {
    public static void main(String[] args) {
        Lesson17_Person personOne = new Lesson17_Person();
        Lesson17_Person personTwo = new Lesson17_Person();

        personOne.setName("First");
        personOne.setAge(20);
        System.out.println(personOne.name);
        System.out.println(personOne.age);
        personOne.calculateYearsOfRetirementVoid();

        personTwo.setNameAndAge("Second", 25);
        System.out.println(personTwo.name);
        System.out.println(personTwo.age);
        personTwo.calculateYearsOfRetirementVoid();
    }
}

class Lesson17_Person {
    String name;
    int age;

    void setName(String username) {
        name = username;
    }

    void setAge(int userAge) {
        age = userAge;
    }

    void setNameAndAge(String username, int userAge) {
        name = username;
        age = userAge;
    }

    void calculateYearsOfRetirementVoid() {
        int years = 65 - age;
        System.out.println("До пенсии осталось " + years);
    }
}