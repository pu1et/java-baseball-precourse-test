package baseball.view;

import nextstep.utils.Console;

public class InputView {
    private static final String INPUT_MSG = "숫자를 입력해주세요 : ";

    public static String getUserInput() {
        System.out.printf("%s", INPUT_MSG);
        return Console.readLine();
    }
}
