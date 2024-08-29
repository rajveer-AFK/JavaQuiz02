
public class DomesticDivision extends Division {
	
	private String state;
	
	// Constructs object by calling the super class constructor and it's own data fields
	public DomesticDivision(String divisionName, int accountNumber, String state) {
		super(divisionName, accountNumber);
		this.state = state;
	}
	
	// Displays the division details
	@Override
	public void display() {
		System.out.println("Domestic Division: " + name + "\nAcct #" + accountNumber + "\nLocated in state: " + state);
	}
}
