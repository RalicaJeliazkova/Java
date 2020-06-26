package registrators;

public class Phone {
    public static boolean isValid(String input){
        return input.matches("[(][0-9]{4}[)][ ][(][0-9]{7}[)]");
    }
}
