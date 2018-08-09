package phonebook;

public class Contact {
	private String first;
	private String last;
	private String number;
	
	
	public Contact(String first, String last, String number) {
		this.first = first;
		this.last = last;
		this.number = number;
	}
	
	public String toString() {
		return first + " " + last + " " + number;
	}

	public String getFirstName() {
		return first;
	}
	
	public String getPhone() {
		return number;
	}
	
}
