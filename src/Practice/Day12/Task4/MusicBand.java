package Practice.Day12.Task4;

import java.util.List;

public class MusicBand {
    private String name;
    private List<String> nameOfMember;
    private int year;

    public MusicBand(String name, int year, List<String> nameOfMember) {
        this.name = name;
        this.year = year;
        this.nameOfMember = nameOfMember;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<String> getNameOfMember() {
        return nameOfMember;
    }

    public void printMembers() {
        System.out.println("Список участников группы " + this.getName() + ": " + this.getNameOfMember());
    }

    public String toString() {
        return "\n" + "Название группы: " + this.name + ". Год основания: " + this.year + "\n" +
                ".Список участников: " + nameOfMember;
    }
}
