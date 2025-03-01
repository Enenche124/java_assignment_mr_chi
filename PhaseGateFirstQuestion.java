public class PhaseGateFirstQuestion{
	
	//public static boolean taskOne(String digits){
	//String stringNumber = "1210";
	
	//char num = stringNumber.charAt();
	
	//}
	
	public static int taskTwo(int[] nums) {
		int sum =  0;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] != nums[1] ){
				sum = sum + nums[i];
				
			}
			
		}
			return sum;
		}
		
		
		public static int taskThree(int[] numbers) {
		int sum =  0;
		int i;
		for( i = 0; i < numbers.length; i++){
			if(numbers[i] != numbers[1] ){
				System.out.print(numbers[i]);
				//sum = sum + nums[i];
				
			}
			
		}
			return numbers[i];
		}
		
		
		
		
		public static boolean taskFive( int number) {
			if(number / number == 1){
				return true;
			}else{
				return false;
			}
			}
			
			//public static boolean functionName5( int number) {
			//write a method that counts the number of occurences of a specified character in a given string
		//}
		
	
	//public static int[] functionName6( int[] arr1, int[] arr2) {
		
		//int[] sorter = arr1;
		//int[] sorter2 = arr2;
		//int[] sort = sorter + sorter2;
		
		//return new int[]{arr1, arr2};
	//}
	
	
	
public static int taskSeven(int numbers){ 
  int counting;
  for( counting = 1; counting < numbers; counting++){

      if(numbers % counting == 0){

	   System.out.print(counting + ",");
	   
   }

 }
  
return counting;

}

	
	public static int taskEigth( int[] number) {
		
			int smallest  = number[0];
			for(int i = 0; i < number.length; i++){
				if(number[i] < smallest){
					smallest = number[i];
				}
			}
			return smallest;
		}	
		
		
		
		//public static int taskNine( int[] number) {
		
		   
			
			
		//}
	
	
	//public static int taskTen( int[] number) {
		//Given an array of integers nunms and an integer target, return indices of the two numbers such that they add up to target
		   
			
			
		//}
	
	

public static void main(String[] args){
	
	int[] arr1 = {3, 1, 5};
	int[] arr2 = {8, 6, 4};
		
	int[] nums = {4, 2, 7, 2, 2};
	
	
	int num = 24;
	int[] arr = {1,3,5,6,5};
	int[] numbers = {3, 3, 4, 5, 6, 7, 8};
	System.out.println(taskThree(numbers));
	
	
	   System.out.println(taskEigth(arr));
	   System.out.println(taskSeven(num));
		System.out.println(taskTwo(nums));
		System.out.println(taskFive(5));
		



  }

}




//input num = "1210"

//at index 0, the digit 0 appears 1 times
//at index 1, the digit 1 appears 2 times
//at index 2, the digit 2 appears 1 times
//at index 3, the digit 3 appears 0 times