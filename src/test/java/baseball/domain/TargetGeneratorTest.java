package baseball.domain;

import baseball.utils.NumberValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;

class TargetGeneratorTest {

    @Test
    @DisplayName("1부터 9까지의 서로 다른 3자리의 숫자로 난수가 생성되어야 한다.")
    void 난수_생성() {
        TargetGenerator targetGenerator = new TargetGenerator();
        String targetNumber = targetGenerator.getTargetNumber();

        int targetNumberDigit = targetNumber.length();
        boolean targetNumberMatched = Pattern.matches("^[1-9]*$", targetNumber);
        boolean targetNumberDuplicated = NumberValidator.isDuplicated(targetNumber);

        assertThat(targetNumberDigit).isEqualTo(3);
        assertThat(targetNumberMatched).isTrue();
        assertThat(targetNumberDuplicated).isTrue();
    }
}
