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
        assertEquals("buzz", fizbuz.fizzBuzz(52));
    }
    
    @Test
    public void testFizzBuzz() {
        FizzBuzzSolution fizbuz = new FizzBuzzSolution();
        assertEquals("fizz buzz", fizbuz.fizzBuzz(15));
    }
    
    @Test
    public void testFizzBuzzStringCombined() {
        FizzBuzzSolution fizbuz = new FizzBuzzSolution();
        assertEquals("fizz buzz", fizbuz.fizzBuzz(35));
    }
    
    @Test
    public void testFizzBuzzNumber() {
        FizzBuzzSolution fizbuz = new FizzBuzzSolution();
        assertEquals("2", fizbuz.fizzBuzz(2));
    }

}



