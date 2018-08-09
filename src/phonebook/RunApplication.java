package phonebook;

public class RunApplication {
	public static void main(String[] args) {
		
		Phonebook pb = new Phonebook("Personal Book");
		
		//print the label
		System.out.println(pb.getLabel());
		
		//add three contacts
		pb.add("Alice", "Green", "555-1234");
		pb.add("Mary", "Smith", "555-6789");
		pb.add("Bob", "Moore", "555-9756");
		
		//print whole phone book
		System.out.println(pb.toString());
		
		//print first contact
		System.out.println(pb.first());
		
		//print last contact
		System.out.println(pb.getLast());
	}
}
