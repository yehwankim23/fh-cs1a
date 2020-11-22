import java.util.ArrayList;
import java.util.Scanner;

/**
 * Prompts and reads the length and width from the user, creates a new Rectangle
 * object, and adds it to the ArrayList four times.
 */
public class TestRectangle {

	public static void main(String[] args) {
		final int NUMBER_OF_RECTANGLE_OBJECTS = 4;
		ArrayList<Rectangle> arrayList = new ArrayList<Rectangle>();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < NUMBER_OF_RECTANGLE_OBJECTS; i++) {
			Rectangle rectangle = new Rectangle();
			System.out.print("Length: ");
			rectangle.setLength(scanner.nextInt());
			System.out.print("Width: ");
			rectangle.setWidth(scanner.nextInt());
			arrayList.add(rectangle);
		}
		scanner.close();
		System.out.println(arrayList);

	}

}

/*
Length: 1
Width: 2
Length: 3
Width: 4
Length: 5
Width: 6
Length: 7
Width: 8
[For this Rectangle: length = 1 and width = 2, For this Rectangle: length = 3 and width = 4, For this Rectangle: length = 5 and width = 6, For this Rectangle: length = 7 and width = 8]
 */