package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class BaseballGameTest {

    @Test
    @DisplayName("스트라이크와 볼의 개수가 정상적으로 확인되어야한다.")
    void 스트라이크_및_볼_판정() {
        BaseballGame baseballGame1 = new BaseballGame("645", "456");
        BaseballGame baseballGame2 = new BaseballGame("457", "456");
        BaseballGame baseballGame3 = new BaseballGame("546", "456");

        assertThat(baseballGame1.getStrike()).isEqualTo(0);
        assertThat(baseballGame1.getBall()).isEqualTo(3);

        assertThat(baseballGame2.getStrike()).isEqualTo(2);
        assertThat(baseballGame2.getBall()).isEqualTo(0);

        assertThat(baseballGame3.getStrike()).isEqualTo(1);
        assertThat(baseballGame3.getBall()).isEqualTo(2);
    }

    @Test
    @DisplayName("스트라이크와 볼의 개수가 각각 0일때 낫싱으로 판정되어야 한다.")
    void 낫싱_판정() {
        BaseballGame baseballGame = new BaseballGame("123", "456");

        assertThat(baseballGame.getStrike()).isEqualTo(0);
        assertThat(baseballGame.getStrike()).isEqualTo(0);
        assertThat(baseballGame.getIsNothing()).isEqualTo(true);
    }

    @Test
    @DisplayName("스트라이크의 개수가 3일 때 승리로 판정되어야 한다.")
    void 승리_판정() {
        BaseballGame baseballGame = new BaseballGame("123", "123");

        assertThat(baseballGame.getStrike()).isEqualTo(3);
        assertThat(baseballGame.getIsWinning()).isEqualTo(true);
    }
}
