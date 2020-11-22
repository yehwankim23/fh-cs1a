import java.util.ArrayList;
import java.util.Scanner;

/**
 * Prompts and reads the first name, last name, social security number, and
 * salary from the user, creates a new Employee object, and adds it to the
 * ArrayList four times.
 */
public class TestEmployee {

	public static void main(String[] args) {
		final int NUMBER_OF_EMPLOYEE_OBJECTS = 4;
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < NUMBER_OF_EMPLOYEE_OBJECTS; i++) {
			Employee employee = new Employee();
			System.out.print("First Name: ");
			employee.setFirstName(scanner.next());
			System.out.print("Last Name: ");
			employee.setLastName(scanner.next());
			System.out.print("Social Security Number: ");
			employee.setSocialSecurityNumber(scanner.next());
			System.out.print("Salary: $");
			employee.setSalary(scanner.nextFloat());
			arrayList.add(employee);
		}
		scanner.close();
		System.out.println(arrayList);

	}

}

/*
First Name: First
Last Name: One
Social Security Number: 111-11-1111
Salary: $1
First Name: Second
Last Name: Two
Social Security Number: 222-22-2222
Salary: $2
First Name: Third
Last Name: Three
Social Security Number: 333-33-3333
Salary: $3
First Name: Fourth
Last Name: Four
Social Security Number: 444-44-4444
Salary: $4
[First One / 111-11-1111 / $1.0, Second Two / 222-22-2222 / $2.0, Third Three / 333-33-3333 / $3.0, Fourth Four / 444-44-4444 / $4.0]
 */