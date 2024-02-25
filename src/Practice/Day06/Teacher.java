package Practice.Day06;

public class Teacher {
    private String name;
    private String academicSubject;

    public Teacher(String name, String academicSubject) {
        this.name = name;
        this.academicSubject = academicSubject;
    }

    public void evaluate(String nameOfStudent) {
        //��������� ��������� ������ �� 2 �� 5
        double score = 2 + Math.round(Math.random()*3.5);
        //���������� � ���� int ��� switch
        int intScore = (int) score;
        //����������, � ������� ����� ������������ ���������� �������� ������
        String stringScore = "";
        switch (intScore) {
            case 2:
                stringScore = "�������������������";
                break;
            case 3:
                stringScore = "�����������������";
                break;
            case 4:
                stringScore = "������";
                break;
            case 5:
                stringScore = "�������";
                break;
        }
        System.out.println("������������� " + name + " ������ �������� � ������ " + nameOfStudent + " �� �������� '" + academicSubject + "' �� ������ " + stringScore + ".");
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
