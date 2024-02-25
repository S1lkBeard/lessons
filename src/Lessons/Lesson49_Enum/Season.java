package Lessons.Lesson49_Enum;

public enum Season {
    //это не строки, а объекты класса (инама) Season
    WINTER("Зима", -20), SPRING("Весна", 10), SUMMER("Лето", 20), AUTUMN("Осень", 5);

    private String translation;
    private int avgTemp;

    Season(String translation, int avgTemp) {
        this.translation = translation;
        this.avgTemp = avgTemp;
    }

    public int getAvgTemp() {
        return avgTemp;
    }

    public String getTranslation() {
        return translation;
    }
}
