import java.util.Scanner;

public class BackToSender{

  public static int logisticesService(int riderTotalDelivery){
  
     if(riderTotalDelivery == 0){
		 
	 System.out.println("No bonus for rider, Zero package delivery");
	 }
       int basePay = 5000;
	   int wages = 0
	  int amountPerParcelLessThanFiftyPercent = 160;
	  int amountPerParcelInRangeFiftyToFiftyNinePercent = 200;
	  int amountPerParcelInRangeSixtyToSixtyNinePercent = 250;
	  int amountPerParcelInRangeSeventyToHundredPercent = 500;
	  
	  
	  
     if(riderTotalDelivery < 50){
		 
	  wages = riderTotalDelivery * amountPerParcelLessThanFiftyPercent + basePay;	 
	 
	 }else if(riderTotalDelivery <= 59){
		 
		 wages = riderTotalDelivery * amountPerParcelInRangeFiftyToFiftyNinePercent + basePay;
		 
	 }else if(riderTotalDelivery <= 69){
		 
		 wages = riderTotalDelivery * amountPerParcelInRangeSixtyToSixtyNinePercent + basePay;
		 
	 }else if(riderTotalDelivery >= 70){
		 
		 wages = riderTotalDelivery * amountPerParcelInRangeSeventyToHundredPercent + basePay;
	}
	 return wages;
  }



public static void main(String[] args){
	
	Scanner receiver = new Scanner(System.in);
	
	System.out.print("Enter deivered number by the rider: ");
	
	int deivered = receiver.nextInt();
	

 System.out.println("The total wages to be collected by the rider is " + logisticesService(deivered));

}
}	