import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class ExpenseApp{
 public static ArrayList<Object> viewExpense = new ArrayList<>();

	public static String displayMenu(){
		
		return "\n 1. Add an expense \n 2. View all expenses \n 3. Calculate total expense \n 4. Exit";
	}
	
		
   public static boolean validateDateFormat(String dates){
	   //while(true){
	   try{
		   
		   java.time.LocalDate.parse(dates, java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		   return true;
		 
	   } catch (java.time.format.DateTimeParseException e){
		   return false;
	   }
    
		  

	   //}
	    
   }
   
   
   
	   public static boolean validateDescription(String descriptions){
		   if(descriptions.trim().isEmpty()){
		   return false;
		   } 
		   return true;
	   }
   
	
	public static boolean validateAmount(double amounts){
		
		if(amounts >= 1){
			return true;
		}else
		return false;
	}



public static void viewExpenses(ArrayList<String> dates, ArrayList<String> descriptions, ArrayList<Double> amounts){
	   double total = 0;
	
		for(int i = 0; i < dates.size(); i++){
		System.out.printf("%d. %s %s %s %s %s %.2f %n", (i + 1), "Date", dates.get(i), "Description", descriptions.get(i), "Amount", amounts.get(i));		
		
		}	
  } 
	
	
public static double calculateAmount(List<Double> amounts){
	double total = 0;
	
	for(double amount : amounts){
		total += amount;
	}
	return total;
}

	
	
	public static void main(String[] args){

		Scanner receiver = new Scanner(System.in);
		
		ArrayList<String> storeDates = new ArrayList<>();
		ArrayList<String> storeDescriptions = new ArrayList<>();
		ArrayList<Double> storAmounts = new ArrayList<>();
		
		
		
		
		System.out.println("Welcome to semicolon expense tracker app");
		System.out.println("========================================");
		while(true){
			
			String menu = displayMenu();
			System.out.println(menu);
			
			
			System.out.print("\nEnter your choice between 1 to 4: ");
			int choice = receiver.nextInt();
			while(choice < 1 || choice > 4){
				System.out.print("Choice must be within 1 to 4: ");
				choice = receiver.nextInt();
			}
			
			
			
			if(choice == 1){
				
				System.out.print("\nEnter the expense date: ");
				String date = receiver.next();
				while(!validateDateFormat(date)){
				System.out.print("Invalid, kindly enter date in this format (yyyy-MM-dd): ");
				date = receiver.next();
				}
				storeDates.add(date);
				
				
				System.out.print("Enter expense description: ");
				String description = receiver.next();
				while(!validateDescription(description)){
				System.out.print("Invalid, Description can't be empty: ");
				description = receiver.next();
				}
				storeDescriptions.add(description);
				
				
				
				System.out.print("Enter expense amount: ");
				double amount = receiver.nextDouble();
				while(!validateAmount(amount)){
					System.out.print("Invalid amount, Amount can't be less than 1: ");
					amount = receiver.nextDouble();
				}
				storAmounts.add(amount);
				
			}else if(choice == 2){
			  System.out.println("Expenses:");
				viewExpenses(storeDates, storeDescriptions, storAmounts);
			}
			else if(choice == 3){
				System.out.println("The total amount is -> $"+ calculateAmount(storAmounts));
			}
			else if(choice == 4){
				System.out.println("Exiting the app, Goodbye!🙋‍♂️");
				break;
			}
		}
		
	}
}