import java.util.*;


public class TaskFourArray{

     public static int taskFourOdd(int[] oddElements) {


   if (oddElements.length == 0){

       System.out.println("The array list is emty");

};

int total = 0;

 for(int k = 0; k < oddElements.length; k++){

    if(oddElements[k] % 2 != 0){

        total = total + oddElements[k];

       


   }


 }

  return total;

}



    public static void main(String[] args) {



   int[] taskFourLists = {8, 5, 3, 9, 16, 25, 21};




      System.out.println(taskFourOdd(taskFourLists));




    }
}
