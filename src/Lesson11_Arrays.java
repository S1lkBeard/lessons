public class Lesson11_Arrays {
    public static void main(String[] args) {
        int number = 10; //примитивный тип данных: число 10 записано в number
        char character = 'a'; //примитивный тип данных
        String s = "Hello"; //ссылочный тип данных
        String s1 = new String("Hello");

        int[] numbers = new int[5];   //numbers -> [массив]  - ссылочный тип данных: numbers ссылается на массив
        System.out.println(numbers[0]);
        numbers[0] = 10;
        numbers[1] = 20;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
            System.out.println(numbers[i]);
        }

        System.out.println();
        int[] secondNumbers = {1, 2, 3};
        for (int i = 0; i < secondNumbers.length; i++) {
            System.out.println(secondNumbers[i]);
        }
    }
}
