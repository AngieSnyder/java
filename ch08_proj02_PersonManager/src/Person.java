
public class Person {
	
	public Person(String first, String last);
	public String getFirstName();
	public void setFirstName(String first);
	public String getLastName();
	public void setLastName(String last);
	@Override
	public String toString() {
		return "Person [getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + "]";
	}
	
	