import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class CheckoutSystem{
	
public static void main(String[] args){
	Scanner receiver = new Scanner(System.in);

double userDiscount;
double subTotal;
double discount;
double vat;
double billTotal;
double givenAmount = 0;
double balance;
String cashierName;
String choice;
double totalAmount;
double totals = 0;
double owning;
int numberOfItem = 0;

  LocalDate current = LocalDate.now();        

ArrayList<String> items = new ArrayList<>();


ArrayList<Integer> quantity = new ArrayList<>();

ArrayList<Double> price = new ArrayList<>();

ArrayList<Double> total = new ArrayList<>();

    System.out.println("What is the customer's name");
	 String customerName = receiver.nextLine();
	 
	 while(!customerName.matches("[a-zA-Z\\s]+")){
		 System.out.println("Enter a valid name");
		 customerName = receiver.nextLine();
		 continue;
	 }
     
	 
       do{
	
		   System.out.println("What did the user buy?");
		  String itemsName = receiver.nextLine();
		  items.add(itemsName);

		   while(!itemsName.matches("[a-zA-Z\\s]+")){
		 System.out.println("Enter a valid product name");
		 itemsName = receiver.next();
		 continue;
	 }
	 
	
		while (true){
			try{
		   System.out.println("How many pieces?");
		   numberOfItem = receiver.nextInt();		
		   break;
			}catch(InputMismatchException e){
				System.out.println("Invalid, pls enter a valid input");
				receiver.next();
			}
		}
			 while(numberOfItem <= 0){
			System.out.println("How many pieces?");
			
			numberOfItem = receiver.nextInt();		
		}
		quantity.add(numberOfItem);
		
		   System.out.println("How much per unit");
		   double amount = receiver.nextDouble();
		   price.add(amount);
		   
		   
		    totalAmount = amount * numberOfItem;
		   total.add(totalAmount);
		  totals = totals + totalAmount;
		  System.out.println("Add more items?");
		   choice = receiver.nextLine();
		   choice = receiver.nextLine();
		   
	 while(!choice.equalsIgnoreCase("yes")&& !choice.equalsIgnoreCase("no")){
			System.out.println("You enter invalid input, choose between (Yes or No)");
			choice = receiver.nextLine();
			continue;
		}
  }while
  (choice.equalsIgnoreCase("Yes"));
  
  subTotal = totals;
  discount = totals * 0.075;
  vat = totals * 0.175;
  billTotal = totals + vat - discount;

 if(!choice.equalsIgnoreCase("Yes")){
		 System.out.println("what is the cashier name");
		 cashierName = receiver.next();
			
			 System.out.println("How much discount will he/she get?");
			 userDiscount = receiver.nextDouble();
			 System.out.println(" ");
			 
			 
			 System.out.printf("%s%n%s", "SEMICOLON STORES", "MAIN BRANCH");
	         System.out.printf("%s%n%s%n", "LOCATION: 312, HERBERT MACAULAY WAY, SABO  YABA, LAGOS.", "TELL: 090896757563");
		     System.out.println("DATE: " + current);
	         System.out.println("CASIER: " + cashierName);
		     System.out.println("CUSTOMER NAME: " + customerName);
	         System.out.println("===================================================================");
			 System.out.printf("%s%14s%22s%22s%n", "ITEMS", "QTY", "PRICE", "TOTAL(NGN)");
			 System.out.println("--------------------------------------------------------------------");

			 for(int i = 0; i < items.size(); i++){
				 System.out.printf("%s%14d%22.2f%22.2f%n", items.get(i), quantity.get(i), price.get(i), total.get(i));
				 
			 }
			 System.out.println("-----------------------------------------------------");
			 System.out.printf("%30s%.2f%n", "Sub total: ", subTotal);
		     System.out.printf("%30s%.2f%n", "Discount: ", discount);
		     System.out.printf("%30s%.2f%n", "Vat @ 17.50%: ", vat);
		     System.out.println("==============================================");
		     System.out.printf("%30s%.2f%n", "Bill total: ", billTotal);
		     System.out.println("==============================================");
		     System.out.println("THIS IS NOT AN RECEIPT KINDLY PAY " + billTotal);
		     System.out.println("==============================================");
			 
             System.out.println(" ");
             System.out.println(" ");
			 

		     System.out.println("How much did the customer give to you? ");
			 givenAmount = receiver.nextInt();
			 balance = givenAmount - billTotal;
			 
			 
			 
			 
			 
			  System.out.printf("%s%n%s", "SEMICOLON STORES", "MAIN BRANCH");
	         System.out.printf("%s%n%s%n", "LOCATION: 312, HERBERT MACAULAY WAY, SABO  YABA, LAGOS.", "TELL: 090896757563");
		     System.out.println("DATE: 3-JAN-2025 8:57:32PM");
	         System.out.println("CASIER: " + cashierName);
		     System.out.println("CUSTOMER NAME: " + customerName);
	         System.out.println("=====================================================================");
			 System.out.printf("%s%14s%22s%22s%n", "ITEMS", "QTY", "PRICE", "TOTAL(NGN)");
			 System.out.println("-----------------------------------------------------");

			 for(int i = 0; i < items.size(); i++){
				 System.out.printf("%s%14d%22.2f%22.2f%n", items.get(i), quantity.get(i), price.get(i), total.get(i));
				 
			 }
			 System.out.println("----------------------------------------------------------------------");
			 System.out.printf("%30s%.2f%n", "Sub total: ", subTotal);
		     System.out.printf("%30s%.2f%n", "Discount: ", discount);
		     System.out.printf("%30s%.2f%n", "Vat @ 17.50%: ", vat);
		     System.out.println("==============================================");
		     System.out.printf("%30s%.2f%n", "Bill total: ", billTotal);
			 System.out.printf("%30s%.2f%n", "Amount paid: ", givenAmount);
			 System.out.printf("%30s%.2f%n", "Balance: ", balance);
		     System.out.println("==============================================");
		     System.out.println("THANK YOU FOR YOUR PATRONAGE");
			 

             
			 }
		




  }

}