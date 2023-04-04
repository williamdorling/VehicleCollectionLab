import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VehicleTest {

    Vehicle vehicle;

    @BeforeEach
    public void setUp(){
        vehicle = new Bus(20, 1000.00, 30000.00, true, false,
                4, false) {
        };
    }

    @Test
    public void canCalculateEfficiency(){
        double expected = 20 * 1000.00 / 30000.00;
        assertThat(vehicle.calculateEfficiency()).isEqualTo(expected);
    }

    @Test
    public void canGetOccupancy(){
        assertThat(vehicle.getOccupancy()).isEqualTo(20);
    }
}
