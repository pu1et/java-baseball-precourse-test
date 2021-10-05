package baseball.utils;

public class NumberValidator {

    public static boolean isDuplicated(String number) {
        if (number.charAt(0) == number.charAt(1)) {
            return false;
        }
        if (number.charAt(1) == number.charAt(2)) {
            return false;
        }
        if (number.charAt(0) == number.charAt(2)) {
            return false;
        }
        return true;
    }
}
