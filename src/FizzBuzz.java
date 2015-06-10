
public class FizzBuzz {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			if(i % 15 == 0)
				System.out.println("FizzBuzz");
			else if(i % 3 == 0)
				System.out.println("Fizz");
			else if(i % 5 == 0)
				System.out.println("Buzz");
			else
				System.out.println(i);
		}
		
		System.out.println("This code should have ran without any errors");
	}
	
	public static void causeRuntimeException() {
		int num = 1/0;
	}

}
