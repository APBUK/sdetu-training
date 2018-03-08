package JavaDev;

public class arrayTest {

	public static void main(String[] args) {
		
		String[] names = {"Adam","Peter","Margaret","Simon"};
		for(int i = 0; i < 4; i++) {
			
			System.out.println(names[i]);
		}

		for(String name : names) {
			
			System.out.println(name);
		}
	
		int i = 0;
		do {
			System.out.println(names[i]);
			i++;
		} while(i < 4);
		
		int counter = 0;
		boolean isTrue = true;
		while(isTrue) {
			
			System.out.println(names[counter]);
			if(names[counter].equals("Margaret")) {
				
				isTrue = false;
			}
			counter++;
		}
	}
	
}
