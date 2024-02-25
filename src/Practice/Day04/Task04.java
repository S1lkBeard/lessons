package Practice.Day04;

public class Task04 {
    public static void main(String[] args) {
        //m - заданная размерность массива
        byte m = 100;
        //создаем массив
        double[] msv = new double[m];
        //создаем переменную для сравнения сумм
        double sums = 0;
        for (int i = 0; i < msv.length; i++) {
            //заполняем массив рандомными значениями от 0 до 10000
            msv[i] = Math.round(Math.random() * 10000);
        }
        //создаем массив, в который будут записываться сумма 3 соседних элементов на каждой итерации
        double[] msvForSums = new double[m];
        int k = 0;
        for (int i = 0; i < msv.length - 2; i++) {
            //в созданный массив записываем суммы 3 соседних элементов
            msvForSums[i] = msv[i] + msv[i + 1] + msv[i + 2];
            //сравниваем суммы
            if (msvForSums[i] > sums) {
                k = i + 1;
                sums = msvForSums[i];
            }
        }
        System.out.println("Сумма 3 элементов массива = " + sums);
        System.out.println("Индекс первого элемента массива из троицы с максимальной суммой = " + k);
    }
}
