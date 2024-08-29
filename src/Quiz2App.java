import java.util.Scanner;

public class Quiz2App {

	public static void main(String[] args) {
		
		// Creates a reference to abstract class Division
		Division divisionTypeReference = null;
		Scanner input = new Scanner(System.in);
		
		// Gets field value data for abstract class fields from the user
		System.out.println("Enter the division name: ");
		String divisionName = input.nextLine();
		
		System.out.println("Enter the account number: ");
		int accountNumber = input.nextInt();
		input.nextLine();
		
		// Gets the division type from the user (international or domestic)
		// Makes the choice upper case
		System.out.println("Would you like to create an InternationDivision Object or Domestic Object: enter I/i or D/d: ");
		char divisionTypeChoice = Character.toUpperCase(input.nextLine().charAt(0));
		
		// Creates InternationDivision or DomesticDivision object depending on users choice
		switch(divisionTypeChoice) {
			// Gets field values for DomesticDivision and creates an object
			case 'D':
				System.out.println("Enter the state the division is located in: ");
				String divisionState = input.nextLine();
				divisionTypeReference = new DomesticDivision(divisionName, accountNumber, divisionState);
				break;
			case 'I':
				// Gets field values for InternationalDivision and creates an object
				System.out.println("Enter the country the division is located in: ");
				String divisionCountry = input.nextLine();
				System.out.println("Enter the language spoken at the division: ");
				String divisionLanguage = input.nextLine();
				divisionTypeReference = new InternationalDivision(divisionName, accountNumber, divisionCountry, divisionLanguage);
		}
		
		// Displays the details about the division
		divisionTypeReference.display();
	}

}
