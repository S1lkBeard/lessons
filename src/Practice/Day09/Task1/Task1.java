package Practice.Day09.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Селезнев А.А.", "ХТ-10-3");
        Teacher teacher = new Teacher("Багдасаров Л.Н.", "Химмотология");

        student.getGroupName();
        teacher.getTeachersSubject();
        student.printInfo();
        teacher.printInfo();
    }
}
