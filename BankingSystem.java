import java.util.Scanner;

public class BankingSystem{
	
	public static void main(String[] args){
		
		Scanner receiver = new Scanner(System.in);
		
		double balance = 0;
		double total = 0;
		String options;
		int choice;
		
		
		
		do{
		
		System.out.println("""
      1. Deposit
		2. Withdraw
		3. Exit
		""");
		 
		while(true){
			 choice = receiver.nextInt();
			if(choice == 1){
				System.out.println("How much do you want to deposit?	 ");
				float depAmount = receiver.nextFloat();
				total = total + depAmount;
				break;
			}
			if(choice == 2){
				System.out.println("How much do you want to withdraw? ");
				 float withdrawedAmount = receiver.nextFloat();
				total = total - withdrawedAmount;
				
				while(withdrawedAmount > total){
					System.out.println("Insufficient account balance");
					break;
				}
				
				break;
			}
			
			
			 if(choice == 3){
				 System.out.println("Exiting app...");
				 break;
			 }
			 if(choice != 1 && choice != 2 && choice != 3){
				 System.out.println("Invalid selecion, please kindly choose between 1 to 3 \n Thanks");
				
				break;
			 }
		
		}
	
		
		System.out.println("Do you want to perform another transaction?	 ");
		options = receiver.next();
		
		while(!options.equalsIgnoreCase("yes")&& !options.equalsIgnoreCase("no")){
			System.out.println("Enter a valid selection yes or no");
			options = receiver.next();
			continue;
		}
	
		}while(options.equalsIgnoreCase("yes"));
		
		
		if(options.equalsIgnoreCase("no")){
		System.out.println("Your account balance is " + total);
		}
	}

}