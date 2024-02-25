public class Lesson50_Recursion {
    public static void main(String[] args) {
        counter(3);

        System.out.println(factorial(4));
    }

    private static void counter(int n) {
        //base case - условие выхода из рекурсии
        if (n == 0)
            return;
        System.out.println(n);
        counter(n - 1);
    }

    //factorial(4)
    //4 * factorial(3) = 4 * 6 = 24
    //3 * factorial(2) = 3 * 2 = 6
    //2 * factorial(1) = 2 * 1 = 2
    //factorial(1) = return 1;
    //и затем идёт перемножение снизу вверх

    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
