public class Lesson31_TypeConversion {
    public static void main(String[] args) {
        int q = 32;
        short w = 143;

        double t = 432.4;
        int n = (int) t;
        System.out.println(n);

        float a = 123.2f; //любое дробное число по умолчанию является double; поэтому для float необходимо указать f или F
        long s = 3242343L; //любое число по умолчанию является integer, поэтому при вводе большого значение появляется ошибка; поэтому для long необходимо указать l или L

        long b = q; //неявное приведение типа
        int z = (int) s; //явное приведение типа

        byte e = (byte) 128; //-128 до 127
        System.out.println(e); //вывод - -128

    }
}
