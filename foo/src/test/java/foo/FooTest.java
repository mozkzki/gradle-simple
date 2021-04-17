package foo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FooTest {
    @Test
    public void testGetMessage() {
        Foo foo = new Foo();
        Assertions.assertEquals("Foo", foo.getMessage());
    }
}
