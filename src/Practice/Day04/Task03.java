package Practice.Day04;

public class Task03 {
    public static void main(String[] args) {
        //m � n - �������� ����������� �������
        byte m = 12;
        byte n = 8;
        //������� 2-������ ������
        double[][] msv2D = new double[m][n];
        //������� ������, � ������� ����� ������������ ����� �����
        double[] msvOfSums = new double[m];
        //���������� ��� ��������� ���� �����
        double sumsOfElementsInRow = 0;
        for (int i = 0; i < msv2D.length; i++) {
            for (int j = 0; j < msv2D[i].length; j++) {
                //��������� ������ ���������� ���������� �� 0 �� 50
                msv2D[i][j] = Math.round(Math.random() * 50);
                //��������� �������� ������
                sumsOfElementsInRow = sumsOfElementsInRow + msv2D[i][j];
            }
            //������� �����
            int k = i + 1;
            //���������� ����� ����� � ��������� ������
            msvOfSums[i] = sumsOfElementsInRow;
            System.out.println();
            System.out.println("����� ��������� " + k + " ������ ��� ������� �����: " + msvOfSums[i]);
            //�������� ����� ������ ��� ����������� �������� ����� ��������� ��������� ������
            sumsOfElementsInRow = 0;
        }
        //���� ��� ����������� ������ ������ � ���������� ������ ���������
        double sums = 0;
        int j = 0;
        for (int i = 0; i < msvOfSums.length; i++) {
            if (msvOfSums[i] >= sums) {
                sums = msvOfSums[i];
                j = i + 1;
            }
        }
        System.out.println();
        System.out.println("����� ������ � ���������� ������ ��������� = " + j);
    }
}
