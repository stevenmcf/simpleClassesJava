import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void checkVolume() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void reduceVolumeBy10() {
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void emptyWaterBottle() {
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void fillWaterBottle() {
        waterBottle.drink();
        waterBottle.refill();
        assertEquals(100, waterBottle.getVolume());
    }
}
