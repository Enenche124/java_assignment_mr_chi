import java.util.*;


public class TaskOneArray{

    public static int taskOneFindingLargest(int[] taskOne) {


   if (taskOne.length == 0){

       System.out.println("The array list is emty");

};



int largest = taskOne[0];

int index = 1;

while (index < taskOne.length){

if(taskOne[index] > largest){

largest = taskOne[index];

}

index++;

}

 return largest;

}


    public static void main(String[] args) {

   int[] taskOneLists = {30, 60, 305, 99, 55, 200, 15};


    System.out.println("The largest element in the list is " + 
    taskOneFindingLargest(taskOneLists));


    }
}
