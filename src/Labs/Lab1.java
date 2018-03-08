package Labs;

public class Lab1 {

	public static void main(String[] args) {
		
		System.out.println(findFactorial(4));
	}

	public static int sumOf(int n) {
		
		int result = 0;
		for(int i = 1; i <= n; i++) {
		
			result += i;
		}
		
		return result;
	}
	
	public static int findFactorial(int n) {
		
		/*
		* if (n == 0) {
		* 	return 1;
		* } 
		* return findFactorial(n-1) * n;
		* 
		*/
		
		
		
		if(n == 0) {
			
			return 0;
		}
		
		if(n == 1) {
			
			return 1;
		}
		
		int result = n;
		
		while((n-1) != 0) {
			
			result *= (n-1);
			n--;
		}
		
		return result;
	}
}
