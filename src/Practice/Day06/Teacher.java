package Practice.Day06;

public class Teacher {
    private String name;
    private String academicSubject;

    public Teacher(String name, String academicSubject) {
        this.name = name;
        this.academicSubject = academicSubject;
    }

    public void evaluate(String nameOfStudent) {
        //случайная генерация оценки от 2 до 5
        double score = 2 + Math.round(Math.random()*3.5);
        //приведение к типу int для switch
        int intScore = (int) score;
        //переменная, в которую будут записываться кириллицей значение оценок
        String stringScore = "";
        switch (intScore) {
            case 2:
                stringScore = "неудовлетворительно";
                break;
            case 3:
                stringScore = "удовлетворительно";
                break;
            case 4:
                stringScore = "хорошо";
                break;
            case 5:
                stringScore = "отлично";
                break;
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + nameOfStudent + " по предмету '" + academicSubject + "' на оценку " + stringScore + ".");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAcademicSubject(String academicSubject) {
        this.academicSubject = academicSubject;
    }

    public void getAcademicSubject() {
        this.academicSubject = academicSubject;
    }
}
