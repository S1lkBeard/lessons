package Practice.Day12.Task3;

public class MusicBand {
    private String name;
    private int year;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return "\n" + "Название группы: " + this.name + ". Год основания: " + this.year;
    }
}
