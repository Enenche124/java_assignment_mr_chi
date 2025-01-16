public class TaskSeven{




public static int taskSeven(int numbers){ 
  int counting;
  for( counting = 1; counting < numbers; counting++){

      if(numbers % counting == 0){

	   System.out.print(counting + ",");
	   
   }

 }
  
return counting;

}




public static void main(String[] args){
	int num = 24;
 System.out.println(taskSeven(num));

}


}