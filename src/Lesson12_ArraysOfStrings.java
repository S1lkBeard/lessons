public class Lesson12_ArraysOfStrings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        String[] strings = new String[3];
        strings[0] = "Привет";
        strings[1] = "Пока";
        strings[2] = "Java";
        System.out.println(strings[0]);
        System.out.println(strings[2]);

        System.out.println();
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        System.out.println();
        for (String stringForEach: strings) {
            System.out.println(stringForEach);
        }

        System.out.println();
        int[] secondNumbers = {1, 2, 3};
        int sum = 0;
        for (int secondNumbersForEach: secondNumbers) {
            sum = sum + secondNumbersForEach;
        }
        System.out.println(sum);

        int value = 0; //выделили 32 бита памяти под value
        String s; //выделяется память под ссылку
        String s1 = "fdsfsdfsdf"; //выделяется память под строку

    }
}
