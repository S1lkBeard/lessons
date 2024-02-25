package Practice.Day04;

public class Task04 {
    public static void main(String[] args) {
        //m - �������� ����������� �������
        byte m = 100;
        //������� ������
        double[] msv = new double[m];
        //������� ���������� ��� ��������� ����
        double sums = 0;
        for (int i = 0; i < msv.length; i++) {
            //��������� ������ ���������� ���������� �� 0 �� 10000
            msv[i] = Math.round(Math.random() * 10000);
        }
        //������� ������, � ������� ����� ������������ ����� 3 �������� ��������� �� ������ ��������
        double[] msvForSums = new double[m];
        int k = 0;
        for (int i = 0; i < msv.length - 2; i++) {
            //� ��������� ������ ���������� ����� 3 �������� ���������
            msvForSums[i] = msv[i] + msv[i + 1] + msv[i + 2];
            //���������� �����
            if (msvForSums[i] > sums) {
                k = i + 1;
                sums = msvForSums[i];
            }
        }
        System.out.println("����� 3 ��������� ������� = " + sums);
        System.out.println("������ ������� �������� ������� �� ������ � ������������ ������ = " + k);
    }
}
