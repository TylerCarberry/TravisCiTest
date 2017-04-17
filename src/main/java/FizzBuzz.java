
public class FizzBuzz {

	public static void main(String[] args) {
		System.out.println(getFizzBuzzRange(1, 100));
	}
	
	public static String getFizzBuzzRange(int min, int max) {
		String result = "";
		for(int i = min; i <= max; i++)
			result += getFizzBuzz(i) + "\n";
		return result;
	}
	
	public static String getFizzBuzz(int num) {
		if(num % 15 == 0)
			return "FizzBuzz";
		else if(num % 3 == 0)
			return "Fizz";
		else
			return ""+num;
	}
}
