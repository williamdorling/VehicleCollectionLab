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

    @Test
    public void canSetMaxSpeed(){
        assertThat(bus.setMaxSpeed(45)).isEqualTo("Max speed set to 45.0 kph");
    }
}
