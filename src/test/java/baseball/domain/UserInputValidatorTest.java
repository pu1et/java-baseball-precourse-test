package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class UserInputValidatorTest {

    @Test
    @DisplayName("게임 플레이어는 1부터 9까지의 서로 다른 3자리의 숫자를 입력해야 유효성이 통과된다.")
    void 게임_플레이어의_정상_입력() {
        UserInputValidator userInputValidator = new UserInputValidator("398");

        assertThat(userInputValidator.getIsValid()).isTrue();
    }

    @Test
    @DisplayName("게임 플레이어가 1부터 9까지가 아니거나, 서로 다른 숫자가 아니거나, 3자리로 입력하지 않으면 유효성이 통과되지 않아야 한다.")
    void 게임_플레이어의_잘못된_입력() {
        UserInputValidator userInputValidator1 = new UserInputValidator("012");
        UserInputValidator userInputValidator2 = new UserInputValidator("133");
        UserInputValidator userInputValidator3 = new UserInputValidator("12");

        assertThat(userInputValidator1.getIsValid()).isFalse();
        assertThat(userInputValidator2.getIsValid()).isFalse();
        assertThat(userInputValidator3.getIsValid()).isFalse();
    }
}
