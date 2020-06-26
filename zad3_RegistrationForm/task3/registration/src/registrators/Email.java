package registrators;

public class Email {
    public static boolean isValid(String input) {
        return input.matches("([a-zA-Z]+([_]|[0-9]*|[a-z]*|[.]*))+[@][a-z]+[.][a-z]+");
    }
}
