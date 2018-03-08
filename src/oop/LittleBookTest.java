package oop;

import java.util.ArrayList;

public class LittleBookTest extends BookTest implements IBook {

	public int a = 10;
	
	//public double getAverageWeight() {
	//	return super.getAverageWeight() + 20;
	//}
	public ArrayList getAverageWeight() {
		
		return new ArrayList<String>();
	}
	
	public static void main(String[] args) {
		System.out.println(new LittleBookTest().getAverageWeight());
		System.out.println(new LittleBookTest().saySomething());
		LittleBookTest test = new LittleBookTest();
		BookTest test2 = (BookTest)test;
		System.out.println(test.a);
		System.out.println(test2.a);
		System.out.println(150);
		IBook.interfaceMethod();
	}


	@Override
	public void testAbstract(int a) {
		System.out.println(Integer.toString(a));
		
	}

}