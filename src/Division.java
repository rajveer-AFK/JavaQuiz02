
public abstract class Division {
	
	protected String name;
	protected int accountNumber;
	
	// Constructs an object
	public Division(String name, int accountNumber) {
		this.name = name;
		this.accountNumber = accountNumber;
	}
	
	// abstract display method for sub classes
	public abstract void display();
	
}
