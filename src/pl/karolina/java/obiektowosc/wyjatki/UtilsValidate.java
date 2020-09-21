package pl.karolina.java.obiektowosc.wyjatki;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UtilsValidate {

    public static void validateForm(String pesel, String email) {
        try {
            validatePesel(pesel);
        } catch (InvalidPeselException e) {
            System.out.println(e.getMessage());
        }

        try {
            validateEmail(email);
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean validatePesel(String pesel) throws InvalidPeselException {
        if (pesel.length() == 11) {
            return true;
        } else {
            throw new InvalidPeselException();
        }
    }

    public static boolean validateEmail(String email) throws InvalidEmailException {
        Pattern pattern = Pattern.compile(".*@.*");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return true;
        } else {
            throw new InvalidEmailException();
        }
    }


}
