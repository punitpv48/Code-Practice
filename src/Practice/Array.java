package Practice;

import java.util.Arrays;

public class Array {
	

	public static void main(String[] args) {
	
	        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	        Arrays.sort(array);
	        reverse(array);
	        System.out.println("Elements of array sorted in descending order: " + Arrays.toString(array));
	    }

	    public static void reverse(int[] array) {
	        int n = array.length;
	        for (int i = 0; i < n / 2; i++) {
	            int temp = array[i];
	            array[i] = array[n - i - 1];
	            array[n - i - 1] = temp;
	        }
	    }
}
