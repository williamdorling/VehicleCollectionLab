import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PlaneTest {
    Plane plane;

    @BeforeEach
    public void setUp(){
        plane = new Plane(7,500, 1000000,
                false, false, false);
    }

    @Test
    public void canSetMaxSpeed(){
        assertThat(plane.setMaxSpeed(3)).isEqualTo("Max speed set to mach 3.0");
    }
}
