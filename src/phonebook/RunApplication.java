package phonebook;

public class RunApplication {
	public static void main(String[] args) {
		
		Phonebook pb = new Phonebook("Personal Book");
		
		//add three contacts
		pb.add("Alice", "Green", "555-1234");
		pb.add("Mary", "Smith", "555-6789");
		pb.add("Bob", "Moore", "555-9756");
		pb.add("Javad", "Alizadeh", "999-9999");
		
		//print the label
		System.out.println(pb.getLabel());
		
		
		//print whole phone book
		System.out.println("\ntoString(): "+pb.toString());
		
		//print first contact
		System.out.println("\nfirst(): "+pb.first());
		
		//print last contact
		System.out.println("\nget(2): "+pb.get(2));
		
		System.out.println("\nFind phone by name: "+pb.getPhoneByFirstName("Javad"));
	}
}
