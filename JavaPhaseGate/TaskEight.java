public class TaskEight{

public static int taskEigth( int[] number) {
		
			int smallest  = number[0];
			for(int i = 0; i < number.length; i++){
				if(number[i] < smallest){
					smallest = number[i];
				}
			}
			return smallest;
		}	
		

public static void main(String[] args){
	int[] arr = {1,3,5,6,5};
 System.out.println(taskEigth(arr));
 
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	