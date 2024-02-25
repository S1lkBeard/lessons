package Practice.Day06;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Иванов И.И.", "Коллоидная химия");
        Student student = new Student("Селезнев А.А.");

        teacher.evaluate(student.getName());
    }
}
