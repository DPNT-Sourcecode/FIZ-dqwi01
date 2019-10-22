package befaster.solutions.FIZ;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizBuzTest {

    @Test
    public void testFizbuz() {
        FizzBuzzSolution fizbuz = new FizzBuzzSolution();
        assertEquals("fizz", fizbuz.fizzBuzz(9));
    }

}

