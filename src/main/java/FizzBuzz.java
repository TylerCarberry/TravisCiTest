
public class FizzBuzz {

	public static void main(String[] args) {
	
		String fizzBuzz = getFizzBuzz(100);
		System.out.println(fizzBuzz);
			
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
	}
	
	public static String getFizzBuzz(int max) {
		String result = "";
		for(int i = 1; i <= max; i++) {
			if(i % 15 == 0)
				result += "FizzBuzz\n";
			else if(i % 3 == 0)
				result += "Fizz\n";
			else if(i % 5 == 0)
				result += "Buzz\n";
			else
				result += i + "\n";
		}
		return result;
	}
}
