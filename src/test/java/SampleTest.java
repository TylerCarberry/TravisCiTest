import static org.junit.Assert.*;

import org.junit.*;

public class SampleTest {
	
	@Test public void testFizzBuzz() {
		FizzBuzz.getFizzBuzz(100);
		FizzBuzz.getFizzBuzz(1);
		FizzBuzz.getFizzBuzz(0);
		FizzBuzz.getFizzBuzz(-1);
	}
}
