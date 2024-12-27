import java.util.Scanner;

public class BackToSender{

  public static int logisticesService(int riderTotalDelivery){
  
     if(riderTotalDelivery == 0){
		 
	 System.out.println("No wages for rider, Zero package delivery");
	 }
       int basePay = 5000;
	  int amountPerParcel = 160, wages = 0;
	  int amountPerParcelFiftyPercent = 200;
	  int amountPerParcelSixtyPercent = 250;
	  int amountPerParcelSeventyPercent = 500;
	  
	  
	  
     if(riderTotalDelivery < 50){
		 
	  wages = riderTotalDelivery * amountPerParcel + basePay;	 
	 
	 }else if(riderTotalDelivery <= 59){
		 
		 wages = riderTotalDelivery * amountPerParcelFiftyPercent + basePay;
		 
	 }else if(riderTotalDelivery <= 69){
		 
		 wages = riderTotalDelivery * amountPerParcelSixtyPercent + basePay;
		 
	 }else if(riderTotalDelivery >= 70){
		 
		 wages = riderTotalDelivery * amountPerParcelSeventyPercent + basePay;
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