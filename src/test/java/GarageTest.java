import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GarageTest {

    Garage garage;

    @BeforeEach
    public void setUp(){
        garage = new Garage();
    }

    @Test
    public void canAddToStock(){
        Plane plane = new Plane(7,500, 1000000,
                false, false, true);
        garage.addToStock(plane);
        assertThat(garage.getStock().size()).isEqualTo(1);
    }

    @Test
    public void canCalculateTotalPrice(){
        Plane plane = new Plane(7,500, 1000000,
                false, false, true);
        CruiseLiner cruiseLiner = new CruiseLiner(3000, 8000, 500000000,true,
                false, 20);
        RemoteControlCar remoteControlCar = new RemoteControlCar(35.5, 50.0, "Blue");
        garage.addToStock(plane);
        garage.addToStock(cruiseLiner);
        garage.addToStock(remoteControlCar);
        assertThat(garage.calculateTotalPrice()).isEqualTo(500000000+1000000+50);
    }

    @Test
    public void canGetStock(){
        assertThat(garage.getStock().size()).isEqualTo(0);
    }

}
