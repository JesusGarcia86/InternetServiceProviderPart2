import java.util.Scanner;
public class InternetServiceProviderPart2 {

	public static void main(String[] args) {
		//Declare variables
		String userInputPackage;
		double PRICE_A = 9.95;
		double PRICE_B = 13.95;
		double PRICE_C = 19.95;
		int LIMIT_A = 10;
		int LIMIT_B = 20;
		double EXTRA_FEE_A = 2.00;
		double EXTRA_FEE_B = 1.00;
		int userInputHours;
		int exceededHours = 0;
		int exceededHoursCompare = 0;
		double extraCharge = 0;
		double extraChargeCompare = 0;
		double totalBill = 0;
		double packageBPriceCompare = 0;
		double packageBSavings = 0;
		double packageCSavings = 0;
		
		//Create a Scanner Object
				Scanner keyboard = new Scanner(System.in);
				
				//Get the user's package
				System.out.println("Enter the letter of the package purchased: ");
				userInputPackage  = keyboard.nextLine();
				
				System.out.println("Enter the number of hours that were used: ");
				userInputHours = keyboard.nextInt();
				
				//Charges if package is A, B or C
				if( userInputPackage.equalsIgnoreCase("a")) {
					if( userInputHours > LIMIT_A) {
						exceededHours = userInputHours - LIMIT_A;
						extraCharge = exceededHours * EXTRA_FEE_A;
					}
				totalBill = PRICE_A + extraCharge;
				System.out.println("Your total charges are $" + totalBill);
				
				//Calculating how much they will pay for package B
				if( userInputHours > LIMIT_B) {
					exceededHoursCompare = userInputHours - LIMIT_B;
					extraChargeCompare = exceededHoursCompare * EXTRA_FEE_B;
				}
				packageBPriceCompare = PRICE_B + extraChargeCompare;
				//Calculating savings por package B
				if ( packageBPriceCompare < totalBill) {
					packageBSavings = totalBill - packageBPriceCompare;
					System.out.printf("You would have saved $%,.2f if you had gotten package B\n",  packageBSavings);
				}
				//Calculating savings for package C
				if( PRICE_C < totalBill) {
					packageCSavings = totalBill - PRICE_C;
					System.out.printf("You would have saved $%,.2f if you had gotten package C",  packageCSavings);
				}
				}
				else if( userInputPackage.equalsIgnoreCase("b")) {
					if( userInputHours > LIMIT_B) {
						exceededHours = userInputHours - LIMIT_B;
						extraCharge = exceededHours * EXTRA_FEE_B;
					}
				totalBill = PRICE_B + extraCharge;
				System.out.println("Your total charges are $" + totalBill);
				
				//Calculate savings from package C
				if( PRICE_C < totalBill ) {
					packageCSavings = totalBill - PRICE_C;
					System.out.printf("You would have saved $%,.2f if you had gotten package C\n",  packageCSavings);
				}
				}
				else if( userInputPackage.equalsIgnoreCase("c")) {
					totalBill = PRICE_C;
					System.out.print("Your total charges are $" + totalBill);
				}
				else if ( userInputPackage.equalsIgnoreCase("d")) {
					System.out.print("That package input was not an option.");
				}
				else if ( userInputPackage.equalsIgnoreCase("e")) {
					System.out.print("That package input was not an option.");
				}
				else if ( userInputPackage.equalsIgnoreCase("f")) {
					System.out.print("That package input was not an option.");
				}
			}
		}
