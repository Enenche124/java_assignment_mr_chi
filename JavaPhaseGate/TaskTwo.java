public class TaskTwo{



public static int taskTwo(int[] nums) {
		int sum =  0;
		for(int i = 0; i < nums.length; i++){
			if(nums[i] != nums[1] ){
				sum = sum + nums[i];
				
			}
			
		}
			return sum;
		}
		




public static void main(String[] args){
	
	int[] nums = {4, 2, 7, 2, 2};
System.out.println(taskTwo(nums));

}


}