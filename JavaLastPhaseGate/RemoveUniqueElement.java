 import java.util.*;

public class RemoveUniqueElement{



    public static int[] removeUniqueElement(int[] arrays){
          int counter2 = 0;
          int counter1 = 0;
          int j;
          int i;
         for( i = 0; i < arrays.length; i++){
         for( j = 1 + i; j < arrays.length; j++){

         if(arrays[i] == arrays[j])counter1++;
  }

}
int[] arr = new int[arrays.length - counter1];
for(int k = 0; k < arrays.length; k++){
arr[counter2] = arrays[i];
  counter2++;

}
return counter2;

   }




public static void main(String[] args){
int[] arrays = {1, 2, 3, 4, 3};
int[] result = removeUniqueElement(arrays);

System.out.println(Arrays.toString(result));
}
}





























































