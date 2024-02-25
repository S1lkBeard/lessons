public class Lesson04_WhileLoops {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println(t);
        boolean s = 5 > 2;
        System.out.println(s);
        boolean w = 5 > 6;
        System.out.println(w);
        boolean e = 5 > 5;
        System.out.println(e);
        boolean r = 5 >= 5;
        System.out.println(r);
        boolean y = 5 == 5;
        System.out.println(y);
        boolean u = 5 == 1;
        System.out.println(u);

        int valueFirst = 0;
        boolean i = valueFirst > 5;
        System.out.println(i);

        int value = 0;
        while (value < 5) {
            System.out.println("Hello " + value);
            value = value + 1;
        }
    }
}
