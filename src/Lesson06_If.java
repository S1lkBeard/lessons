public class Lesson06_If {
    public static void main(String[] args) {
        if (5 == 5) {
            System.out.println("Да, верно");
        }

        if (5 > 1) {
            System.out.println("Да, верно");
        }

        if (5 < 4) {
            System.out.println("Да, верно");
        } else {
            System.out.println("Нет, неверно");
        }

        int myInt = 15;
        if (myInt < 10) {
            System.out.println("Нет, неверно");
        } else if (myInt > 20) {
            System.out.println("Нет, неверно");
        }

        int mySecondInt = 15;
        if (mySecondInt < 10) {
            System.out.println("Нет, неверно");
        } else if (mySecondInt > 20) {
            System.out.println("Нет, неверно");
        } else {
            System.out.println("Ни один из предыдущих случаев");
        }

        int myThirdInt = 5;
        if (myThirdInt < 10) {
            System.out.println("Да, верно");
        } else if (myThirdInt < 20) {
            System.out.println("Да, верно");
        }
    }
}
