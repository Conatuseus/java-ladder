package ladder;

import ladder.model.Line;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LineTest {
    @Test
    void 플레이어수_보다_1작은_Line이_만들어지는지_확인(){
        assertThat(new Line(5).size()).isEqualTo(4);
    }

}
