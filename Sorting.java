import java.util.Scanner;

public class Sorting{
	
    public static void main(String[] args){
	 
	 
	 int principal;
	 int daily;
	 int years;
	 double interestRate;
	 int monthlyContribution;
	 int compoundFrequency;
	 double amount = 0;
	 Scanner receiver = new Scanner(System.in);
	 
 
	 while(true){
		 
		  System.out.println("""
               1. Anually
			   2. Semianually
			   3. Quaterly
			   4. Monthly
			   5. Daily

	 """);
	int options = receiver.nextInt();
	if(options == 1){
	 System.out.print("Enter principal: ");
	  principal = receiver.nextInt();
	 
	  System.out.print("Enter interest rate: ");
	  interestRate = receiver.nextDouble() / 100;
	 
	 System.out.print("Enter number of years: ");
	  years = receiver.nextInt();
	 
	  System.out.print("Enter monthly contribution: ");
	  monthlyContribution = receiver.nextInt();
	 
	 
	  System.out.print("Enter compound frequency: ");
	  compoundFrequency = receiver.nextInt();
A = P(1 + R/N)NT
		 
		 amount = principal;
	     for(int i = 0; i < years * compoundFrequency; i++){
		 amount = amount + (amount * (interestRate / compoundFrequency) + monthlyContribution);
		 }
 	  System.out.printf("%s%.2f", "The future value of your invested money is: ", amount);

	 }
	 break;

		 
	 }
	 
	 
	 
    }
 
   
 }
 
 
 
 
 
 