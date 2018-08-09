package phonebook;

public class Phonebook {
	private String label;
	
	//limit phonebook contacts
	private final static int MAX = 100;
	private Contact[] contacts;
	private int next = 0;
	
	public Phonebook(String name) {
		this.label = name;
		contacts = new Contact[MAX];
	}
	
	//return phonebook label
	public String getLabel() {
		return label;
	}
	
	public void add(String first, String last, String number) {
		Contact c = new Contact(first, last, number);
		contacts[next++] = c;
	}

	public String first() {
		/*
		 * violation of encapsulation
		 * 
		 * Contact c = contacts[0];
		 * return c.getFirst() + " " + c.getLast() + " " + c.getPhone();
		 */
		
		return "\n#1: " + contacts[0].toString();
	}

	public String get(int i) {
		if(i > 0)
			return "\n#"+i+": " + contacts[--i].toString();
		else
			return "ERROR! You must choose a number bigger than 0";
	}
	
	public String toString() {
		String total = ""; 
		for (int i = 0; i < next; i++) {
			total += "\n#"+(i+1)+": " + contacts[i].toString();
		}
		
		return total;
	}

	public String getPhoneByFirstName(String name) {
		for (int i = 0; i < next; i++) {
			if(contacts[i].getFirstName().contentEquals(name))
				return "\n"+name + "`s phone number is: (" + contacts[i].getPhone() + ")";
		}
		
		return "\nNo phone number found for " + name;
	}
	
	
}
