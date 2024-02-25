import Lessons.Lesson29_Package1.Person;

public class Lesson29_Modificators {
    public int id1;
    private int id2;
    int id3; //default
    protected int id4;

    public static void main(String[] args) {
        //public, private, default, protected
        //public - разрешает доступ к классу/методу/полю
        //private - запрещает доступ к методу/полю, но не к классу - класс не может быть private
        //default - устанавливается по умолчанию, если не был указан любой другой
        //все default объекты доступны в пределах одного пакета
        //protected объекты доступны в пределах одного пакета, а так же всем подклассам
        //

        Person person = new Person();
        person.nameOne = "First";
        //к nameTwo нет доступа, потому что у неё модификатор default вместо public
        //person.nameTwo = "Second";
        //к nameFour так же нет доступа, но из-за модификатор protected
        //person.nameFour = "Four";
    }

    private void technicalMethod() {

    }
}
