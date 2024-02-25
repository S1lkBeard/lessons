public class Lesson22_Final {
    public static void main(String[] args) {
        final int x = 10;
        System.out.println(x);
        //final переменную (константу) нельзя изменить
        //        x = 5;
    }
}

class Test {
    //имена констант принято писать заглавными буквами
    //зачастую final переменные (константы) создаются как static
    //потому что логично, что константа существует в одном экземпляре
    public static final int CONSTANT = 100;

    //final переменную (константу) нельзя изменить
    public Test(int CONSTANT) {
    //        this.CONSTANT = CONSTANT;
    }

    //в контексте final переменных сеттеры не имеют смысла
    public void setCONSTANT(int x) {
    //        this.CONSTANT = x;
    }
}