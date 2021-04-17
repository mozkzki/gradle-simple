package bar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BarTest {
    @Test
    public void testGetMessage() {
        Bar bar = new Bar();
        Assertions.assertEquals("Bar", bar.getMessage());
    }
}
