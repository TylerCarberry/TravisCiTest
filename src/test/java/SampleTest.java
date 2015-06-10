import static org.junit.Assert.*;

import org.junit.*;

public class SampleTest {
	
	// Verify that FizzBuzz can be generated and printed from 1 to 1000
	@Test public void printFizzBuzz() {
		System.out.println(FizzBuzz.getFizzBuzzRange(1,1000));
	}
	
	@Test public void verifyFizz() {
		for(int i = 3; i <= 100; i+=3)
			if(i % 5 != 0)
				assertTrue(FizzBuzz.getFizzBuzz(i).equalsIgnoreCase("Fizz"));
	}
	
	@Test public void verifyBuzz() {
		for(int i = 5; i <= 100; i+=5)
			if(i % 3 != 0)
				assertTrue(FizzBuzz.getFizzBuzz(i).equalsIgnoreCase("Buzz"));
	}
	
	@Test public void verifyFizzBuzz() {
		for(int i = 15; i <= 100; i+=15)
			assertTrue(FizzBuzz.getFizzBuzz(i).equalsIgnoreCase("FizzBuzz"));
	}
	
	@Test public void verifyNumbers() {
		for(int i = 1; i <= 100; i++)
			if(i % 3 != 0 && i % 5 != 0)
				assertTrue(FizzBuzz.getFizzBuzz(i).equalsIgnoreCase(""+i));
	}
}
