package Labs;

import java.util.Arrays;

public class Lab1Q2 {

	public static void main(String[] args) {
		
		int[] testArray = {-12,-23,-6,-4,-3};
		System.out.println(arrayMin(testArray));
		System.out.println(arrayMax(testArray));
		System.out.println(arrayAverage(testArray));
	}


	public static int arrayMin(int[] minArray) {
		
		Arrays.sort(minArray);
		int minimumNum = minArray[0];
		
		return minimumNum;
	}
	
	public static int arrayMax(int[] maxArray) {
		
		Arrays.sort(maxArray);
		int maximumNum = maxArray[(maxArray.length - 1)];
		
		return maximumNum;
	}
	
	public static int arrayAverage(int[] avArray) {
		
		int average = 0;
		for(int element : avArray) {
			
			average += element;
		}
		
		average /= avArray.length;
		return average;
	}
}
