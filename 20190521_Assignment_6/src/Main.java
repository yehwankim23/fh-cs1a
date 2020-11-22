import java.util.Random;
import java.util.Scanner;

//  Makes and prints an array that contains the requested amount of randomly generated integers between 1 and 10.
public class Main {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);

		System.out.println("How many random numbers do you want to keep track of?");
		int arrayLength = scanner.nextInt();
		scanner.close();

		int[] array = new int[arrayLength];
		for (int i = 0; i < arrayLength; i++) {
			array[i] = random.nextInt(10) + 1;

		}

		for (int i = 0; i < arrayLength; i++) {
			System.out.println(array[i]);

		}

	}

}

/*
How many random numbers do you want to keep track of?
5
4
1
6
1
6
 */