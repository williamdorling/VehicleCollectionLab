import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BusTest {

    Bus bus;

    @BeforeEach
    public void setUp(){
        bus = new Bus(28, 700, 20000, true, false, 8, false);
    }

    @Test
    public void canSetAirconTemperature(){
        assertThat(bus.setAirconTemperature(19)).isEqualTo("Temperature set to 19 degrees.");
    }
}
