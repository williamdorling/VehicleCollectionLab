import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RemoteControlCarTest {
    RemoteControlCar remoteControlCar;

    @BeforeEach
    public void setUp(){
        remoteControlCar = new RemoteControlCar(10.0, 35.0, "Red");
    }

    @Test
    public void canSetPrice(){
        remoteControlCar.setPrice(40.0);
        assertThat(remoteControlCar.getPrice()).isEqualTo(40.0);
    }
    @Test
    public void canGetPrice(){
        assertThat(remoteControlCar.getPrice()).isEqualTo(35.0);
    }

    @Test
    public void canDrive(){
        assertThat(remoteControlCar.drive(40.5)).isEqualTo("Red remote control car drove 40.5m");
    }


}
