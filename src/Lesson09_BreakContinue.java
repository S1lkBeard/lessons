public class Lesson09_BreakContinue {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i == 15) {
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Вышли из цикла");

        for (int x = 0; x <= 15; x++) {
            if (x % 2 == 0) {
                continue;  //всё, что идёт после continue не выполняется
            }
            System.out.println("Это нечетное число: " + x);
        }
    }
}
