import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CruiseLinerTest {

    CruiseLiner cruiseLiner;

    @BeforeEach
    public void setUp(){
        cruiseLiner = new CruiseLiner(3000, 8000, 500000000,true,
                false, 20);
    }

    @Test
    public void canDropAnchor(){
        assertThat(cruiseLiner.dropAnchor()).isEqualTo("Anchor is now dropped, this boat will no longer move");
    }

    @Test
    public void canSetMaxSpeed(){
        assertThat(cruiseLiner.setMaxSpeed(3.7)).isEqualTo("Max speed set to 3.7 knots");
    }

    @Test
    public void canSetDestinationHome(){
        assertThat(cruiseLiner.setDestination()).isEqualTo("Destination set to home");
    }

    @Test
    public void canSetDestination(){
        assertThat(cruiseLiner.setDestination("New York")).isEqualTo("Destination set to New York");
    }

}
