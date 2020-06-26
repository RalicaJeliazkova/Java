package registrators;

public class Password {
    public static boolean isValid(String input){
        return input.matches("[a-zA-z]{1,}[0-9]{7,}");
    }
}
