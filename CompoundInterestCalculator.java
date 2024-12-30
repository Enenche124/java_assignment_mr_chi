import java.util.Scanner;

public class CompoundInterestCalculator {
 
	  public static double calculateCompoundInterest(double principal, double interestRate, 
 
     double duration, double frequency, double monthlyContribution){

  	 
	 return principal * Math.pow((1 + interestRate / 100 / frequency), frequency * duration) - principal
	 
	 + monthlyContribution * Math.pow((1 + interestRate / frequency), (frequency * duration) -1) / (interestRate / frequency);
	
 }

    public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
        System.out.println("Compound Interest Calculator");
		System.out.println("Determine how much your money can grow using the power of compound interest.");
        System.out.println("---------------------------------------------------------------------------");

        System.out.print("Enter the principal amount: $");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (%): ");
        double interestRate = scanner.nextDouble();

        System.out.print("Enter the duration (years): ");
        double duration = scanner.nextDouble();

        System.out.print("Enter the compounding frequency (per year): ");
        double frequency = scanner.nextDouble();
		
		System.out.print("Enter your PMT: $");
        double monthlyContribution = scanner.nextDouble();
		
		
		double  compoundInterest = calculateCompoundInterest(principal, interestRate, duration, frequency, monthlyContribution);
		System.out.printf("%s%.2f", "Compound Interest: $", compoundInterest);


    }


 }

