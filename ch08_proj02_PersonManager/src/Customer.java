
public class Customer extends Person {
	public String customerNumber;

	public Customer(String customerNumber) {
		super();
		this.customerNumber = customerNumber;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomer(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	@Override
	public String toString() {
		return "Name: [firstName=" + firstName + ", lastName=" + lastName + "customerNumber=" + customerNumber + "]";
	}
	
	
}
