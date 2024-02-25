package Lessons.Lesson29_Package1;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        //здесь есть доступ к переменной nameTwo с модификатором default, потому что класс Test1 находится в том же пакете, что и класс Person
        person.nameTwo = "Second";
        //к переменной nameThree нет доступа даже несмотря на то, что классы находятся в одном пакете - из-за модификатора private
        //person.nameThree = "Third";
        System.out.println(person.nameFour);
    }
}