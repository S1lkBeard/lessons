package Practice.Day07;

public class Player {
    private double stamina;
    public static final double MAX_STAMINA = 100;
    public static final double MIN_STAMINA = 0;
    //переменная для подсчета количества игроков на поле
    private static int countPlayers;
    //индивидуальный номер игрока
    private int playersNumber;

    public Player() {
        if (countPlayers < 6) {
            countPlayers = countPlayers + 1;
            this.playersNumber = countPlayers;
            this.stamina = 90 + Math.round(Math.random() * 10);
            System.out.println("Игрок под номером " + this.playersNumber + " вышел на поле. Его выносливость - " + this.stamina);
        } else {
            System.out.println("Команды укомплектованы - на поле не может быть больше 6 игроков");
        }
    }

    public double getStamina() {
        System.out.println("Выносливость игрока = " + this.stamina);
        return this.stamina;
    }

    public double getNumberOfPlayer() {
        System.out.println("Количество игроков на поле = " + countPlayers);
        return countPlayers;
    }

    public void getRun() {
        if (!(this.stamina == MIN_STAMINA)) {
            System.out.println("Игрок под номером " + this.playersNumber + " совершил действие");
            this.stamina = this.stamina - 1;
        } else {
            System.out.println("Игрок выдохся");
            countPlayers = countPlayers - 1;
        }
    }

    public void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " мест");
        } else if (countPlayers == 6) {
            System.out.println("Команды укомплектованы");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}
