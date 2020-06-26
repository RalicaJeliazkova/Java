package registrators;

public class UserName {
    public static boolean isValid (String input) {
        return input.matches("[a-zA-Z]{4,}");

    }
}
