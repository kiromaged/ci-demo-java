import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {

    @Test
    public void testAdd() {
        assertEquals(12, App.add(5, 7));
    }

    @Test
    public void testMultiply() {
        assertEquals(35, App.multiply(5, 7));
    }
}
