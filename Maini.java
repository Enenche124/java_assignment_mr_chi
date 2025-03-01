import java.util.*;


public class TaskOneArray{

    public static int findLargest(int[] taskOne) {

   if (taskOne.length == 0){

       System.out.pruntln("The array list is emty");


}

int max = taskOne[0];

 for(int i = 0; i <= taskOne.length; i++){

    if(i > max){
   
      max = i;


}

return max;

}





        //return Collections.max(getNum);

    //}

    public static void main(String[] args) {


    

       // List<Integer> theLists = Arrays.asList(448, 2, 1, 69, 5, 10);

      //  System.out.println("Largest element: " + theLargest(theLists));
    }
}
