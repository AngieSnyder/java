
public class Employee extends Person {
	
	private String socialSecurityNumber;

	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		super(firstName, lastName);
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public String toString() {
		return "Employee [socialSecurityNumber=" + socialSecurityNumber + "]";
	}
}
