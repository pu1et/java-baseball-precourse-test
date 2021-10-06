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
}
