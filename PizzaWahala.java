import java.util.*;

public class PizzaWahala{
	
       public static void main(String[] args){
	   
	   Scanner receiver = new Scanner(System.in);
	   
	    System.out.printf("%s%n", "Welcome to Iya Moses Pizza joint Ajegunle.");
		
	   System.out.print("Enter number of yous guest: ");
	   
	   int numberOfGuest = receiver.nextInt();
	   
	   System.out.printf("%s%n", "Here is our pizza list, Choose the type of pizza to buy!");
	   
	   System.out.printf("%18s%18s%10s%n", "Pizza type | ", "Number of Slices | ", "Price per box" );
	   
	   System.out.println("""         

    1.  Sapa size          4                2,500
	
	  2.  Small money         6                  2,900

    3.  Big boys           8                4,000
	
    4. odogwu             12               5,200
	
	   """);
	   
	   
	   double numberOfBoxToBuy = numberOfGuest / 4;
	   double numberOfBoxToBuyS = numberOfGuest / 6;
	   double numberOfBoxToBuyB = numberOfGuest / 8;
	   double numberOfBoxToBuyO = numberOfGuest / 12;
	   
	   
	   if(numberOfGuest % 4 != 0)numberOfBoxToBuy = numberOfBoxToBuy + 1;
	    if(numberOfGuest % 6 != 0)numberOfBoxToBuyS = numberOfBoxToBuyS + 1;
		if(numberOfGuest % 8 != 0)numberOfBoxToBuyB = numberOfBoxToBuyB + 1;
		if(numberOfGuest % 12 != 0)numberOfBoxToBuyO = numberOfBoxToBuyO + 1;
	   
	   double leftOver = numberOfBoxToBuy * 4;
	   double left = leftOver - numberOfGuest;
	   
	   double leftOverS = numberOfBoxToBuyS * 6;
	   double  left2 = leftOverS - numberOfGuest;
	   
	   
	   double leftOverB = numberOfBoxToBuyB * 8;
	   double left3 = leftOverB - numberOfGuest;
	   
	   double leftOverO = numberOfBoxToBuyO * 12;
	   double left4 = leftOverO - numberOfGuest;
	   
	   
	   int sapa, sapaPrice = 2500, sapaSlice = 4;
	   
	   int small, smallPrice = 2900, smallSlice = 8;
	   
	   int bigBoys, bigBoysPrice = 4000, bigBoysSlice = 6;
	   
	   int odogwu, odogwuPrice = 5200, odogwuSlice = 12;
	   
	   
	   
	   while(true){
		   
		   System.out.print("Choose from (1-4) the type of pizza you want: ");
		   
		   int customerChoiceOfPizza = receiver.nextInt();
		   
		   if(customerChoiceOfPizza == 1){
			  
		  System.out.println("Number of boxes of pizza to buy is: " + numberOfBoxToBuy  + " Number left over slices after serving " + left  + " The price for ordered pizza is:" + numberOfBoxToBuy * sapaPrice);
			
		   }else if(customerChoiceOfPizza == 2){
			   
			  System.out.println("Number of boxes of pizza to buy is: " + numberOfBoxToBuyS + " Number left over slices after serving " + left2 + " The price for ordered pizza is:" + numberOfBoxToBuyS * smallPrice);
					  
		   }else if(customerChoiceOfPizza == 3){
			   
			   System.out.println("Number of boxes of pizza to buy is: " + numberOfBoxToBuyB + " Number left over slices after serving " + left3  + " The price for ordered pizza is:" +  numberOfBoxToBuyB*bigBoysPrice);
		   }else if(customerChoiceOfPizza == 4){
			   System.out.println("Number of boxes of pizza to buy is: " + numberOfBoxToBuyO + " Number left over slices after serving " + left4  + " The price for ordered pizza is:" + numberOfBoxToBuyO*odogwuPrice);
		   }
		   break;

	   }   
	   
	 }


}