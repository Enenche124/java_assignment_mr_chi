public class TaskThree{




	public static int taskThree(int[] numbers) {
		
		int i;
		for( i = 0; i < numbers.length; i++){
			if(numbers[i] != numbers[1] ){
				System.out.print(numbers[i]);
				
				
			}
			
		}
			return numbers[i];
		}
		



public static void main(String[] args){
	
	int[] lists = {4, 4, 5, 6, 77, 8};
	System.out.println(taskThree(lists));


}


}