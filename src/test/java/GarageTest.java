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
        Helicopter helicopter = new Helicopter(7,500, 1000000,
                false, false, 4);
        garage.addToStock(helicopter);
        assertThat(garage.getStock().size()).isEqualTo(1);
    }

    @Test
    public void canCalculateCapacity(){
        Helicopter helicopter = new Helicopter(7,500, 1000000,
                false, false, 4);
        CruiseLiner cruiseLiner = new CruiseLiner(3000, 8000, 500000000,true,
                false, 20);
        garage.addToStock(helicopter);
        garage.addToStock(cruiseLiner);
        assertThat(garage.calculateCapacity()).isEqualTo(3007);
    }

    @Test
    public void canGetStock(){
        assertThat(garage.getStock().size()).isEqualTo(0);
    }

}
