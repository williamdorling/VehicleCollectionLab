import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HelicopterTest {
    Helicopter helicopter;

    @BeforeEach
    public void setUp(){
        helicopter = new Helicopter(7,500, 1000000,
                false, false, 4);
    }

    @Test
    public void canAutoRotate(){
        assertThat(helicopter.autoRotate()).isEqualTo("Safely autorotating to the ground");
    }
}
