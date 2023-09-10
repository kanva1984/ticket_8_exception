import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        String login = "java_timur";
        try {
            Checking.checking(login);
        } catch (WrongLoginException wrongLoginException) {
            System.out.println("Wrong login!");
            wrongLoginException.printStackTrace();
        }
        System.out.println("Next!");
    }
}

class WrongLoginException extends RuntimeException {
    public WrongLoginException(String massage) {
        super(massage);
    }
}

class Checking {
    public static void checking(String login) {
        if (!Pattern.matches("^[a-zA-Z0-9_]{1,20}$", login)) {
            throw new WrongLoginException("Wrong login!");
        }
    }
}