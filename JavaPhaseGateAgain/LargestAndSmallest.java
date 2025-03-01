import java.util.*;
public class LargestAndSmallestNumber{

  public static int[] findLargestAndSmallest(int[] arrays){
  int smallest = arrays[0];
  int largest = arrays[0];


  for(int i = 0; i < arrays.length; i++){
  if(arrays[i] > largest){
  largest = arrays[i];
}
if(arrays[i] < smallest){
smallest = arrays[i];
}
}
return new int[]{largest, smallest};
}


public static void main(String[] args){
int[] arrays = {1, 4, 1, 20, 5, 0, -1};
int[] result = findLargestAndSmallest(arrays);
System.out.println(Arrays.toString(result));

}
}