import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {

    @Test
    public void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long expected = 30;
        long actual = service.calculate(1_000, true);
        //System.out.println(expected + " == ? == " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long expected = 500;
        long actual = service.calculate(1_000_000, true);
        //System.out.println(expected + " == ? == " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testRegisteredUnderLimit() {
        BonusService service = new BonusService();

        long expected = 150;
        long actual = service.calculate(5_000, true);
        //System.out.println(expected + " == ? == " + actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUnregistredUnderLimit() {
        BonusService service = new BonusService();

        long expected = 50;
        long actual = service.calculate(5_000, false);
        //System.out.println(expected + " == ? == " + actual);

        Assertions.assertEquals(expected, actual);
    }
}
