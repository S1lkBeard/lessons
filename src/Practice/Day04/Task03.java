package Practice.Day04;

public class Task03 {
    public static void main(String[] args) {
        //m и n - заданная размерность массива
        byte m = 12;
        byte n = 8;
        //создаем 2-мерный массив
        double[][] msv2D = new double[m][n];
        //создаем массив, в который будут записываться суммы строк
        double[] msvOfSums = new double[m];
        //переменная для сравнения сумм строк
        double sumsOfElementsInRow = 0;
        for (int i = 0; i < msv2D.length; i++) {
            for (int j = 0; j < msv2D[i].length; j++) {
                //заполняем массив рандомными значениями от 0 до 50
                msv2D[i][j] = Math.round(Math.random() * 50);
                //суммируем элементы строки
                sumsOfElementsInRow = sumsOfElementsInRow + msv2D[i][j];
            }
            //счетчик строк
            int k = i + 1;
            //записываем суммы строк в созданный массив
            msvOfSums[i] = sumsOfElementsInRow;
            System.out.println();
            System.out.println("Сумма элементов " + k + " строки под номером равна: " + msvOfSums[i]);
            //обнуляем сумму строки для корректного подсчета суммы элементов следующей строки
            sumsOfElementsInRow = 0;
        }
        //цикл для определения номера строки с наибольшей суммой элементов
        double sums = 0;
        int j = 0;
        for (int i = 0; i < msvOfSums.length; i++) {
            if (msvOfSums[i] >= sums) {
                sums = msvOfSums[i];
                j = i + 1;
            }
        }
        System.out.println();
        System.out.println("Номер строки с наибольшей суммой элементов = " + j);
    }
}
