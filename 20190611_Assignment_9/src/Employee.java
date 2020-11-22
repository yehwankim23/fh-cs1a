/**
 * One object of this class represents an employee's first name, last name,
 * social security number, and salary.
 */
public class Employee {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private float salary;

	/**
	 * Sets the first name, last name, social security number, and salary of the
	 * Employee object to "Ye-Hwan", "Kim", "000-00-0000", and "0.00" when the
	 * object is created.
	 */
	public Employee() {
		this.firstName = "Ye-Hwan";
		this.lastName = "Kim";
		this.socialSecurityNumber = "000-00-0000";
		this.salary = 0.0F;
	}

	/**
	 * Sets the first name, last name, social security number, and salary of the
	 * Employee object to "firstName", "lastName", "socialSecurityNumber", and
	 * "salary".
	 */
	public Employee(String firstName, String lastName, String socialSecurityNumber, float salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.salary = salary;
	}

	/**
	 * Returns the first name of the Employee object.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the first name of the Employee object to "firstName".
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * Returns the last name of the Employee object.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name of the Employee object to "lastName".
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Returns the social security number of the Employee object.
	 */
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	/**
	 * Sets the social security number of the Employee object to
	 * "socialSecurityNumber".
	 */
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	/**
	 * Returns the salary of the Employee object.
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * Sets the salary of the Employee object to "salary".
	 */
	public void setSalary(float salary) {
		this.salary = salary;
	}

	/**
	 * Returns a String containing the first name, last name, social security
	 * number, and salary of the Employee object.
	 */
	public String toString() {
		return firstName + " " + lastName + " / " + socialSecurityNumber + " / $" + salary;
	}

	/**
	 * Adds "percentRaise" percent of the current salary to the salary field of the
	 * Employee object
	 */
	public void giveRaise(float percentRaise) {
		float newSalary = salary + salary * percentRaise / 100;
		this.setSalary(newSalary);
	}

}
