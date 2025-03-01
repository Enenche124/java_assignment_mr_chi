import java.util.*;


public class TaskSevenArray{

     public static boolean taskSevenEven(String palindrome) {

  
    StringBuilder palind = new StringBuilder(palindrome);
       


        return palind.reverse().toString().equals(palindrome);

   }



       public static void main(String[] args) {


         System.out.println(taskSevenEven("54145"));

         System.out.println(taskSevenEven("mayowa"));





    }
}
