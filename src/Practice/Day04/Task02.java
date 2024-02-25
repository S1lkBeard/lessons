package Practice.Day04;

public class Task02 {
    public static void main(String[] args) {
        double[] msv1 = new double[100];
        for (int i = 0; i < msv1.length; i++) {
            msv1[i] = Math.round(Math.random() * 10000);
        }
        double smallestElementOfMsv1 = msv1[0];
        double biggestElementOfMsv1 = msv1[0];
        byte countsOfElementsWithZero = 0;
        double sumOfElementsWithZero = 0;
        for (double elementsOfMsv1 : msv1) {
            if (elementsOfMsv1 < smallestElementOfMsv1) {
                smallestElementOfMsv1 = elementsOfMsv1;
            }
            if (elementsOfMsv1 > biggestElementOfMsv1) {
                biggestElementOfMsv1 = elementsOfMsv1;
            }
            if (elementsOfMsv1 % 10 == 0) {
                countsOfElementsWithZero++;
                sumOfElementsWithZero = sumOfElementsWithZero + elementsOfMsv1;
            }
        }
        System.out.println("Наименьший элемент массива = " + smallestElementOfMsv1);
        System.out.println("Наибольший элемент массива = " + biggestElementOfMsv1);
        System.out.println("Количество элементов массива, оканчивающихся на 0 = " + countsOfElementsWithZero);
        System.out.println("Сумма этих элементов = " + sumOfElementsWithZero);
    }
}
