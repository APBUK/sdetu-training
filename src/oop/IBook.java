package oop;

public interface IBook {

	public static void interfaceMethod() {
		
		System.out.println("interface static method");
	}
	
	public default void standardMethod() {
		
		System.out.println("This is another test of default methods");
	}
}
