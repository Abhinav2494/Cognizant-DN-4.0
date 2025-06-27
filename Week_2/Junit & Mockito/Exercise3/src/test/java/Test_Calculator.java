import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_Calculator {
    private Caluculator calc;
    @Before
    public void setup(){
        System.out.println("Setting up the test and creating object");
        calc = new Caluculator();
    }

    @After
    public void cleanup() {
        System.out.println("Cleaning up the test");
        calc = null;
    }

    @Test
    public void testCalc(){
        System.out.println("Test started.");
        int result = calc.add(5, 2);
        assertEquals(7, result);
    }

}
