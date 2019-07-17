import java.util.Random;

public class Simplifying_Fractions {
	
	public static int generateNum1() {
		Random rand = new Random();
		int low = 1;
		int high = 12;
		int result = rand.nextInt(high - low) + low;
		return result;
	}
	
	public static int generateNum2() {
		Random rand = new Random();
		int low = 1;
		int high = 12;
		int result = rand.nextInt(high - low) + low;
		return result;
	}
	
	public static void main (String [] args) {
		int number1 = generateNum1();
		int number2 = number1 * generateNum2();
		
		System.out.println(" " + number1);
		System.out.println("----");
		System.out.println(" " + number2);
	}
}
