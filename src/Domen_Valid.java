import java.util.regex.Pattern;

public class Domen_Valid {

    public static boolean validateEmail(String email, String domen) {
        if (email == null) return false;
        Pattern emailPattern = Pattern.compile("^\\p{L}+_\\p{L}+([0-9]+)?"+domen+"$");
        return Pattern.matches(emailPattern.pattern(), email);
    }
}