package baseball.view;

import nextstep.utils.Console;

public class InputView {
    private static final String INPUT_MSG = "숫자를 입력해주세요 : ";
    private static final String NEW_GAME_OR_QUIT_MSG = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public static String getUserInput() {
        System.out.printf("%s", INPUT_MSG);
        return Console.readLine();
    }

    public static int getNewGameOrQuitGameInput() {
        System.out.println(NEW_GAME_OR_QUIT_MSG);
        return Integer.parseInt(Console.readLine());
    }
}
