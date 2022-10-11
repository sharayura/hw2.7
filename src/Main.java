
public class Main {
    public static void main(String[] args) {

        try {
            System.out.println(Data.checkData("dfdfd", "123", "123"));
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}