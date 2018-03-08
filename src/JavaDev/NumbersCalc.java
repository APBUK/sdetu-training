package JavaDev;

public class NumbersCalc {

	public static void main(String[] args) {

		printName();
		addNums(10, 20);
		System.out.println(multNums(20, 40));
	}

	public static void printName() {
		
		System.out.println("My name is Adam");		
	}

	public static void addNums(int a, int b) {
		
		System.out.println(a + " plus " + b + " is equal to: " + (a + b));
	}
	
	public static int multNums(int numberA, int numberB) {
		
		return numberA * numberB;
	}
}
