/**
 * Creates a new Employee object and manipulates its data.
 */
public class TestEmployee {

	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println(employee);
		employee = new Employee("John", "Smith", "123-45-6789", 1);
		System.out.println(employee);
		employee.setFirstName("Ye-Hwan");
		System.out.println(employee.getFirstName());
		employee.setLastName("Kim");
		System.out.println(employee.getLastName());
		employee.setSocialSecurityNumber("000-00-0000");
		System.out.println(employee.getSocialSecurityNumber());
		employee.setSalary(2);
		System.out.println(employee.getSalary());
		employee.giveRaise(50);
		System.out.println(employee.getSalary());

	}

}

/*
Ye-Hwan Kim / 000-00-0000 / $0.0
John Smith / 123-45-6789 / $1.0
Ye-Hwan
Kim
000-00-0000
2.0
3.0
 */