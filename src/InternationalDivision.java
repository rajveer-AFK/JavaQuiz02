
public class InternationalDivision extends Division {
	
	private String country;
	private String language;
	
	// Constructs object by calling the super class constructor and it's own data fields
	public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
		super(divisionName, accountNumber);
		this.country = country;
		this.language = language;
	}
	
	// Displays the division details
	@Override
	public void display() {
		System.out.println("International Division: " + name + "\nAcct #" + accountNumber + "\nLocated in : " + country + "\nLangauge spoken: " + language);
	}
}
