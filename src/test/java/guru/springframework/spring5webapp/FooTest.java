package guru.springframework.spring5webapp;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class FooTest {
    @Test
    public void getBar() {
        Foo foo = new Foo();
        String result = foo.getBar();
        assertEquals("FooBar",result);
    }
}