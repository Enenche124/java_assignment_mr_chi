import java.util.*;
public class RemoveTargetElement{

  public static int[] removeTargetElement(int[] arrays, int target){
	     
int count = 0;
 int[] arr;
 int i;
 int j;
	 
	   for(i = 0; i < arrays.length; i++){
		   if(arrays[i] == target)count++; 	     
	   }
	   
	   
	  if(count == 0){
		  return arrays;
	  }else{
	   
	   arr = new int[arrays.length - count];	
	  int  counter2 = 0;
	  
	   for(j = 0; j < arrays.length; j++){
		   if(arrays[j] != target){
		   arr[counter2] = arrays[j];
		   counter2++;
		   }
	 }
	  }
	    return arr;
   }
	   



public static void main(String[] args){
	int[] arrays = {4, 6, 3, 8, 9, 4};
	int target = 4;
	int resulti[] = removeTargetElement(arrays, target);
	System.out.println(Arrays.toString(resulti));
}
}