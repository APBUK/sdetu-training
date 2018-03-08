package JavaDev;

public class FiboApp {

	public static void main(String[] args) {

		int fib = 0;
		int fib2;
		
		for(int i = 0; ; i++) {
			
			fib2 = fibNum(i);
			
			if(fib2 >= fib) {
				
				System.out.println("Fib " + i + " = " + fib2);
				fib = fib2;
			} else {
				
				System.out.println("Calculation over");
				break;
			}
		}
	}

	public static int fibNum(int n) {
		
		if (n == 0) {
			
			return 0;
		}
		
		if (n == 1) {
			
			return 1;
		}
		return fibNum(n-1) + fibNum(n-2);
	}
}
