import org.junit.Test;
import static org.junit.Assert.*;

public class Test_Calculator {

    Calculator obj = new Calculator();
    @Test
    public void tester( ){
        int result = obj.add(5,6);
        assertEquals(11 , result);

        assertEquals(5, 2 + 3);

        assertTrue(5 > 3);

        assertFalse(5 < 3);

        assertNull(null);

        assertNotNull(new Calculator());
    }
}
