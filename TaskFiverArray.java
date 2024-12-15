import java.util.*;


public class TaskFiverArray{

     public static int taskFiveEven(int[] evenElements) {


   if (evenElements.length == 0){

       System.out.println("The array list is emty");

};

int total = 0;

 for(int k = 0; k < evenElements.length; k++){

    if(evenElements[k] % 2 == 0){

        total = total + evenElements[k];
       


   }


 }

  return total;

}



    public static void main(String[] args) {



   int[] taskFiveLists = {8, 5, 3, 9, 16, 25, 21};




      System.out.println(taskFiveEven(taskFiveLists));




    }
}
