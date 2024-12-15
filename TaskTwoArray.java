import java.util.*;


public class TaskTwoArray{

     public static void taskTwoReverseList(Integer[] taskTwo) {


   if (taskTwo.length == 0){

       System.out.println("The array list is emty");

};


 Collections.reverse(Arrays.asList(taskTwo));

System.out.println(Arrays.asList(taskTwo));


}


    public static void main(String[] args) {


   Integer[] taskTwoLists = {1, 2, 3, 4, 5, 6, 7};

      taskTwoReverseList(taskTwoLists);


    }
}
