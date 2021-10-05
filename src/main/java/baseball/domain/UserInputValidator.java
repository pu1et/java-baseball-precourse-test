package baseball.domain;

import java.util.regex.Pattern;

public class UserInputValidator {
    private static final int NUM_LEN =3;

    private final String userInput;
    private final boolean isValid;

    public UserInputValidator(String userInput) {
        this.userInput = userInput;
        this.isValid = setIsValid();
    }

    public boolean getIsValid() {
        return isValid;
    }

    public boolean setIsValid() {
        if (!isValidLength()) {
            return false;
        }
        if (!isValidNumber()) {
            return false;
        }
        return true;
    }

    private boolean isValidLength() {
        return userInput.length() == NUM_LEN;
    }

    private boolean isValidNumber() {
        return Pattern.matches("^[1-9]*$", userInput);
    }
}
