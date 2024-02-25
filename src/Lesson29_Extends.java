import Lessons.Lesson29_Package1.Person;

public class Lesson29_Extends extends Person {

    public Lesson29_Extends() {
        //несмотря на то, что nameFour является protected и класс Lesson29_Extends находится в другом пакете
        //но благодаря тому, что данный класс наследуется от класса Person, в котором задекларирована переменная
        //к этой переменной есть доступ
        nameFour = "FourFour";
    }
}
