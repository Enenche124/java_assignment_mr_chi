import java.util.*;
public class FindSingleOccurence{

          public static int findSingleOccurence(int[] nums){

             int unigue = 0;
			 for (int i : nums){
				 unigue^=i;
				 
			}
			System.out.println(unigue);
			return unigue;
		  }
		  

		public static void main(String[] args){
		int[] numbers = { 1, 4, 4, 1, 7};
		//int[] result = findSingleOccurence(numbers);
		System.out.println(findSingleOccurence(numbers));

	
	
	}
}