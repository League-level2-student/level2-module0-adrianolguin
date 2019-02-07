package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {

	static Random rand = new Random();

	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] c = { "one", "two", "three", "four" };
		// 2. print the third element in the array
		System.out.println(c[2]);
		// 3. set the third element to a different value
		c[2] = ("hello");
		// 4. print the third element again
		System.out.println(c[2]);
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int x = 0; x < c.length; x++) {
			System.out.println(c[x]);
		}
		// 6. make an array of 50 integers
		int[] d = new int[50];
		// 7. use a for loop to make every value of the integer array a random number
		for (int x = 0; x < d.length; x++) {
			d[x] = rand.nextInt(200)+1;
		}

		System.out.println("The smallest number is: " + getSmallest(d));
		System.out.println("The largest number is: " + getLargest(d));

		for (int x = 0; x < d.length; x++) {
			System.out.println(d[x]);

		}

		// 8. without printing the entire array, print only the smallest number in the
		// array

		// 9 print the entire array to see if step 8 was correct

		// 10. print the largest number in the array.
	}

	static int getSmallest(int[] array) {
		int a = 0;
		for (int x = 0; x < array.length; x++) {
			if (a < array[x]) {
			} else {
				a = array[x];
			}
		}
		return a;
	}

	static int getLargest(int[] array) {
		int a = 0;
		for (int x = 0; x < array.length; x++) {
			if (a < array[x]) {
				a = array[x];
			} else {

			}
		}
		return a;
	}

}
