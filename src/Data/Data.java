package Data;

public class Data {
    private static final String VALID_SYMBOLS = "abcdefghigklmnopqrstuvwxyzABCDEFGHIGKLMNOPQRSTUVWXYZ123456789_";
    public static boolean validate ( String login,
                                     String password,
                                     String confirmPassword){

    try {
        check(login,
                password,
                confirmPassword);
    }catch (WrongPasswordException | WrongLoginException e) {
        System.out.println(e.getMessage());
        return false;
    }
    return true;
    }
    public static void check ( String login,
                                  String password,
                                  String confirmPassword) throws WrongPasswordException, WrongLoginException {
        if (!validate(login)) {
            throw new WrongLoginException("Логин некорректный!");
        }
        if (!validate(password)) {
            throw new WrongPasswordException("Пароль некорректный!");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли должны совпадать!");
        }
    }
    private static boolean validate (String s){
        if (s.length() > 20) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!VALID_SYMBOLS.contains(String.valueOf(s.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}
