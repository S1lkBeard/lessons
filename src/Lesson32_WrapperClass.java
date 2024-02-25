public class Lesson32_WrapperClass {
    public static void main(String[] args) {
        int x1 = 1;
        System.out.println(x1);

        Integer x2 = new Integer(123); //отображается отображение, т.к. такой способ избыточен
        x2.compareTo(125);
        Integer.parseInt("123");

        Integer x3 = 123; //автоупаковка
        int y = x3; //автораспаковка

        //Классы-обёртки - Double, Float, Long, Integer, Short, Byte, Character и Boolean. Обратить внимание на заглавные буквы
    }
}
