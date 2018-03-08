import oop.ConTest2;

public class HelloWorld extends ConTest2 {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		ConTest2 con = new ConTest2();
		HelloWorld hi = new HelloWorld();
		hi.accessTest();
		System.out.println(hi.getA());
		hi = null;
		hi.accessTest();
	}
	
	private static void accessTest() {
		
		System.out.println("Available");
	}


}

