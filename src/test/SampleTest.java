import static org.junit.Assert.*;

import org.junit.*;

public class SampleTest {
	@Test public void sample() {
		boolean b = true;
		assertTrue(b);
	}
	
	@Test public void causeException() {
		FizzBuzz.causeRuntimeException();
	}
	
	@Test public void isZero() {
		assertEquals(FizzBuzz.getZero(), 0);
	}
	
	@Test public void alwaysFails() {
		boolean b = false;
		assertTrue(b);
	}
	
	
	
	

}
