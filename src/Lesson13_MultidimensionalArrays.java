public class Lesson13_MultidimensionalArrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[1]);

        System.out.println();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(matrix[2][2]);
        System.out.println(matrix[1][0]);

        System.out.println();
        int[][] secondMatrix = {{1, 2, 3, 4, 5}, {4}, {7, 8}};  //матрица необ€зательно должна быть квадратной
        System.out.println(secondMatrix[0][4]);
        System.out.println(secondMatrix[1][0]);
        System.out.println(secondMatrix[2][1]);

        int[] secondNumbers = new int[5];

        System.out.println();
        String[][] doubleDimensionalStrings = new String[2][3];  //первый индекс двумерного массива - количество строк, второй - столбцов
        doubleDimensionalStrings[0][1] = "ѕривет";
        System.out.println(doubleDimensionalStrings[0][1]);

        System.out.println();
        int[][] thirdMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < thirdMatrix.length; i++) {
            for (int j = 0; j < thirdMatrix[i].length; j++) {
                System.out.print(thirdMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
