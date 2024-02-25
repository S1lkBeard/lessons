package Practice.Day07;

public class Player {
    private double stamina;
    public static final double MAX_STAMINA = 100;
    public static final double MIN_STAMINA = 0;
    //���������� ��� �������� ���������� ������� �� ����
    private static int countPlayers;
    //�������������� ����� ������
    private int playersNumber;

    public Player() {
        if (countPlayers < 6) {
            countPlayers = countPlayers + 1;
            this.playersNumber = countPlayers;
            this.stamina = 90 + Math.round(Math.random() * 10);
            System.out.println("����� ��� ������� " + this.playersNumber + " ����� �� ����. ��� ������������ - " + this.stamina);
        } else {
            System.out.println("������� �������������� - �� ���� �� ����� ���� ������ 6 �������");
        }
    }

    public double getStamina() {
        System.out.println("������������ ������ = " + this.stamina);
        return this.stamina;
    }

    public double getNumberOfPlayer() {
        System.out.println("���������� ������� �� ���� = " + countPlayers);
        return countPlayers;
    }

    public void getRun() {
        if (!(this.stamina == MIN_STAMINA)) {
            System.out.println("����� ��� ������� " + this.playersNumber + " �������� ��������");
            this.stamina = this.stamina - 1;
        } else {
            System.out.println("����� �������");
            countPlayers = countPlayers - 1;
        }
    }

    public void info() {
        if (countPlayers < 6) {
            System.out.println("������� ��������. �� ���� ��� ���� " + (6 - countPlayers) + " ����");
        } else if (countPlayers == 6) {
            System.out.println("������� ��������������");
        } else {
            System.out.println("�� ���� ��� ��������� ����");
        }
    }
}
