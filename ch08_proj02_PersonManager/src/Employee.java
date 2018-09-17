
public class Employee extends Person {
	public String ssn;

	public Employee(String ssn) {
		super();
		this.ssn = ssn;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "Name: [firstName=" + firstName + ", lastName=" + lastName + " ssn=\" + ssn]";
	}
	
	
}
