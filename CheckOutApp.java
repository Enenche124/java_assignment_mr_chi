import java.util.Scanner;

public class CheckOutApp {
    public static void main(String[] args) {
        

        Scanner scanner = new Scanner(System.in);
		int numberOfItemsPurchase;
		int numberOfItemsPurchase2 = 0;
		double amount;
		double amount2 = 0;
		 String customerPurchase;
		 String customerPurchase2;
		 String cashierName = " ";
		 double userDiscount;
		 String choice;
		 double sub;
		double subt;
		double subTotal;
	    double discount;
	    double vat;
		double billTotal;
		int givenAmount;
		double balance;
		
			
		
     System.out.println("What is the customer's name");
	 String customerName = scanner.nextLine();
	 

      do{
		  
		   System.out.println("What did the user buy?");
		   customerPurchase = scanner.next();
		  
		   System.out.println("How many pieces?");
		   numberOfItemsPurchase = scanner.nextInt();
		  
		   System.out.println("How much per unit");
		   amount = scanner.nextDouble();
		  
		  System.out.println("Add more items?");
		  choice = scanner.next();
		 

		 // if(choice.equalsIgnoreCase("Yes")){
		  
		  
		  
	  //}
	  
	 

	  }while(choice.equalsIgnoreCase("Yes"));
	 
	

	   if(!choice.equalsIgnoreCase("Yes")){
		 System.out.println("what is the cashier name");
		 cashierName = scanner.next();
			
			 System.out.println("How much discount will he/she get?");
			 userDiscount = scanner.nextDouble();
			 System.out.println(" ");
			 System.out.println(" ");

			
			 sub = amount * numberOfItemsPurchase;
			 subt = amount2 * numberOfItemsPurchase2;
		     subTotal = sub + subt;
			 discount = subTotal * 0.08;
			 vat = subTotal * 0.175;
			 billTotal = subTotal + vat - discount;
	
			
		System.out.printf("%s%n%s", "SEMICOLON STORES", "MAIN BRANCH");
	    System.out.printf("%s%n%s%n", "LOCATION: 312, HERBERT MACAULAY WAY, SABO  YABA, LAGOS.", "TELL: 090896757563");
		System.out.println("DATE: 3-JAN-2025 8:57:32PM");
	    System.out.println("CASIER: " + cashierName);
		System.out.println("CUSTOMER NAME: " + customerName);
	    System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");
		System.out.printf("%8s%8s%8s%16s%n", "ITEMS", "QTY", "PRICE", "TOTAL(NGN)");
		System.out.println("---------------------------------------------");
		System.out.printf("%8s%6d%14.2f%16.2f%n", customerPurchase, numberOfItemsPurchase,  amount, amount* numberOfItemsPurchase);
	    System.out.printf("%8s%6d%14.2f%16.2f%n", customerPurchase2, numberOfItemsPurchase2,  amount2, amount2* numberOfItemsPurchase2);
        System.out.println("---------------------------------------------");
		System.out.printf("%30s%.2f%n", "Sub total: ", subTotal);
		System.out.printf("%30s%.2f%n", "Discount: ", discount);
		System.out.printf("%30s%.2f%n", "Vat @ 17.50%: ", vat);
		System.out.println("==============================================");
		System.out.printf("%30s%.2f%n", "Bill total: ", billTotal);
		System.out.println("==============================================");
		System.out.println("THIS IS NOT AN RECEIPT KINDLY PAY " + billTotal);
		System.out.println("==============================================");
		System.out.println("How much did the customer give to you?");
		 givenAmount = scanner.nextInt();
		 balance =  givenAmount - billTotal;
		 System.out.println(" ");
		 System.out.println(" ");
		
		System.out.printf("%s%n%s", "SEMICOLON STORES", "MAIN BRANCH");
	    System.out.printf("%s%n%s%n", "LOCATION: 312, HERBERT MACAULAY WAY, SABO  YABA, LAGOS.", "TELL: 090896757563");
		System.out.println("DATE: 3-JAN-2025 8:57:32PM");
	    System.out.println("CASIER: " + cashierName);
		System.out.println("CUSTOMER NAME: " + customerName);
	    System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");
		System.out.printf("%8s%8s%8s%16s%n", "ITEMS", "QTY", "PRICE", "TOTAL(NGN)");
		System.out.println("---------------------------------------------");
		System.out.printf("%8s%6d%14.2f%16.2f%n", customerPurchase, numberOfItemsPurchase,  amount, amount* numberOfItemsPurchase);
	    System.out.printf("%8s%6d%14.2f%16.2f%n", customerPurchase2, numberOfItemsPurchase2,  amount2, amount2* numberOfItemsPurchase2);
        System.out.println("---------------------------------------------");
		System.out.printf("%30s%.2f%n", "Sub total: ", subTotal);
		System.out.printf("%30s%.2f%n", "Discount: ", discount);
		System.out.printf("%30s%.2f%n", "Vat @ 17.50%: ", vat);
		System.out.println("==============================================");
		System.out.printf("%30s%.2f%n", "Bill total: ", billTotal);
		System.out.printf("%30s%d%n", "Amount paid: ", givenAmount);
		System.out.printf("%30s%.2f%n", "Balance: ", balance);
		System.out.println("==============================================");
		System.out.println("THANK YOU FOR YOUR PATRONAGE");
		System.out.println("==============================================");

	  }
	
   
    }
}
