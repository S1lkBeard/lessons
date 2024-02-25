package Lessons.Lesson49_Enum;

public enum Season {
    //��� �� ������, � ������� ������ (�����) Season
    WINTER("����", -20), SPRING("�����", 10), SUMMER("����", 20), AUTUMN("�����", 5);

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
