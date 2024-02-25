package Practice.Day14.Task1;

public class WrongInputFile extends Exception {
    public WrongInputFile() {
    }
    //если exception принимает на вход параметр, и необходимо, чтобы этот desc выводился в консоль
    //то при использовании try-catch в блоке catch необходимо указать:
    //catch (WrongInputFile e) {
    //            throw new RuntimeException(e);
    //        }
//    public WrongInputFile(String desc) {
//        super(desc);
//    }
}
