public class EvenToZeroSndOddToOne{
    
	public static int[] evenToZeroSndOddToOne(int[] numbers){
		int evenNum = 0;
		int oddNum = 1;
		
		for(int i = 0; i < numbers.length; i++){
			if(numbers[i] % 2 == 0){
				evenNum = evenNum + 0;
				 System.out.print(" " + evenNum);
				
			}
			if(numbers[i] % 2 != 0){
				
			System.out.print(" " + oddNum);
			}
			
		}
			

        return new int[]{evenNum, oddNum};
	}


public static void main(String[] args){
	
	int[] numbers = {4, 5, 6, 7, 8};
	evenToZeroSndOddToOne(numbers);
}
}