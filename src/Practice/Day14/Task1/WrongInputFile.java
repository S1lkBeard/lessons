package Practice.Day14.Task1;

public class WrongInputFile extends Exception {
    public WrongInputFile() {
    }
    //���� exception ��������� �� ���� ��������, � ����������, ����� ���� desc ��������� � �������
    //�� ��� ������������� try-catch � ����� catch ���������� �������:
    //catch (WrongInputFile e) {
    //            throw new RuntimeException(e);
    //        }
//    public WrongInputFile(String desc) {
//        super(desc);
//    }
}
