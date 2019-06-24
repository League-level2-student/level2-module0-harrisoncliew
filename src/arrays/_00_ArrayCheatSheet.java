package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] names = new String[5];
		// 2. print the third element in the array
		System.out.println(names[3]);
		// 3. set the third element to a different value
		names[3] = "element num3";
		// 4. print the third element again
		System.out.println(names[3]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		// 6. make an array of 50 integers
		int[] moreNames = new int[50];
		Random r = new Random();
		for (int o = 0; o < moreNames.length; o++) {
			moreNames[o] = r.nextInt(51);
		}
		int lowNum = moreNames[0];

		for (int low : moreNames) {
			if (lowNum > low) {
				lowNum = low;
			}

		}

		// 8. without printing the entire array, print only the smallest number in the
		// array
		System.out.println("Lowest Number");
		System.out.println(lowNum);
		System.out.println("Whole Array");
		// 9 print the entire array to see if step 8 was correct
		for (int j = 0; j < moreNames.length; j++) {
			System.out.println(moreNames[j]);
		}
		// 10. print the largest number in the array.
		int highNum = moreNames[0];

		for (int high : moreNames) {
			if (highNum < high) {
				highNum = high;
			}
		}
		System.out.println("Highest Number");
		System.out.println(highNum);
	}

}
