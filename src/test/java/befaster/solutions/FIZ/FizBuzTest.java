package befaster.solutions.FIZ;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizBuzTest {

    @Test
    public void testFizz() {
        FizzBuzzSolution fizbuz = new FizzBuzzSolution();
        assertEquals("fizz", fizbuz.fizzBuzz(9));
    }
    
    @Test
    public void testFizzStringThree() {
        FizzBuzzSolution fizbuz = new FizzBuzzSolution();
        assertEquals("fizz", fizbuz.fizzBuzz(32));
    }

    @Test
    public void testBuzz() {
        FizzBuzzSolution fizbuz = new FizzBuzzSolution();
        assertEquals("buzz", fizbuz.fizzBuzz(10));
    }
    
    @Test
    public void testFizzStringFive() {
        FizzBuzzSolution fizbuz = new FizzBuzzSolution();
        assertEquals("buzz fake deluxe", fizbuz.fizzBuzz(5));
    }
    
    @Test
    public void testFizzBuzzDeluxe() {
        FizzBuzzSolution fizbuz = new FizzBuzzSolution();
        assertEquals("fizz buzz fake deluxe", fizbuz.fizzBuzz(15));
    }
    
    @Test
    public void testFizzBuzzNumber() {
        FizzBuzzSolution fizbuz = new FizzBuzzSolution();
        assertEquals("2", fizbuz.fizzBuzz(2));
    }
    
    @Test
    public void testDeluxeNumber() {
        FizzBuzzSolution fizbuz = new FizzBuzzSolution();
        assertEquals("buzz deluxe", fizbuz.fizzBuzz(50));
    }
    
    @Test
    public void testFizDeluxeNumber() {
        FizzBuzzSolution fizbuz = new FizzBuzzSolution();
        assertEquals("fizz fake deluxe", fizbuz.fizzBuzz(33));
    }
    
    @Test
    public void testBuzzDeluxeNumber() {
        FizzBuzzSolution fizbuz = new FizzBuzzSolution();
        assertEquals("buzz fake deluxe", fizbuz.fizzBuzz(55));
    }
    
    @Test
    public void testFizzNumber() {
        FizzBuzzSolution fizbuz = new FizzBuzzSolution();
        assertEquals("buzz fake deluxe", fizbuz.fizzBuzz(5));
    }
    
    @Test
    public void testFakeDeluxeNumber() {
        FizzBuzzSolution fizbuz = new FizzBuzzSolution();
        assertEquals("11", fizbuz.fizzBuzz(11));
    }
    
    
    @Test
    public void testDeluxeMatchNumber() {
        FizzBuzzSolution fizbuz = new FizzBuzzSolution();
        assertEquals("fizz deluxe", fizbuz.fizzBuzz(36));
    }

}
