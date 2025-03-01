import java.util.*;


public class TaskThreeArray{

     public static boolean taskThreeOccursList(int[] elements, int occurs) {


   if (elements.length == 0){

       System.out.println("The array list is emty");

};

 for(int j = 0; j < elements.length; j++){

    if(elements[j] == occurs){

       return true;


   }


 }

  return false;

}



    public static void main(String[] args) {


   int[] taskThreeLists = {14, 52, 33, 45, 59, 26, 77};

      System.out.println(taskThreeOccursList(taskThreeLists, 59));

      System.out.println(taskThreeOccursList(taskThreeLists, 5));



    }
}
