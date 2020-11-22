// Compares three double values and prints out the results. 
public class Main {
	// Calls methods and prints out the results to the console.
	public static void main(String[] args) {
		System.out.println(smallest(3.5, 6.7, -8.5)); // prints -8.5
		System.out.println(largest(3.5, 6.7, -8.5)); // prints 6.7
		System.out.println(average(3.5, 6.7, -8.5)); // prints .57
		System.out.println(allTheSame(3.5, 6.7, -8.5)); // prints false
		System.out.println(allDifferent(3.5, 6.7, -8.5)); // prints true

	}

	// Returns true if the three double values are all different.
	private static boolean allDifferent(double a, double b, double c) {
		boolean result = false;
		if (a != b && a != c && b != c) {
			result = true;
		}
		return result;
	}

	// Returns true if the three double values are all the same.
	private static boolean allTheSame(double a, double b, double c) {
		boolean result = false;
		if (a == b && a == c && b == c) {
			result = true;
		}
		return result;
	}

	// Returns the average of the three double values.
	private static double average(double a, double b, double c) {
		double result = (a + b + c) / 3;
		return result;
	}

	// Returns the largest of the three double values.
	private static double largest(double a, double b, double c) {
		double result = a;
		if (result < b) {
			result = b;
		}
		if (result < c) {
			result = c;
		}
		return result;
	}

	// Returns the smallest of the three double values.
	private static double smallest(double a, double b, double c) {
		double result = a;
		if (b < result) {
			result = b;
		}
		if (c < result) {
			result = c;
		}
		return result;
	}

}

/*
-8.5
6.7
0.5666666666666664
false
true
 */
