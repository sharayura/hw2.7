import java.util.regex.Pattern;

public class Data {

    public static boolean checkData(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        if (login == null || login.isEmpty()) {
            throw new WrongLoginException("Логин не должен быть пустым");
        } else {
            if (login.length() > 20) {
                throw new WrongLoginException("Логин содержит слишком много символов");
            }
            if (!Pattern.matches("\\w+", login)) {
                throw new WrongLoginException("Логин содержит запрещенные символы");
            }
        }
        if (password == null || password.isEmpty()) {
            throw new WrongPasswordException("Пароль не должен быть пустым");
        }else {
            if (password.length() > 20) {
                throw new WrongPasswordException("Пароль содержит слишком много символов");
            }
            if (!Pattern.matches("\\w+", password)) {
                throw new WrongPasswordException("Пароль содержит запрещенные символы");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли не совпадают");
            }
        }
        return true;
    }
}
