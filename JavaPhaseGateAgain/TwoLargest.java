import java.util.*;
public class TwoLargest{

  public static int[] findTwoLargest(int[] arrays){
  int firstLargest = arrays[0];
  int secondLargest = arrays[1];


  for(int i = 0; i < arrays.length; i++){
  if(arrays[i] > firstLargest){
  secondLargest = firstLargest;

  firstLargest = arrays[i];
}


if(arrays[i] > secondLargest && arrays[i] < firstLargest){
secondLargest = arrays[i];
}
}
return new int[]{firstLargest, secondLargest};
}


public static void main(String[] args){
int[] arrays = { -6, -1, -8, 0, -10};
int[] result = findTwoLargest(arrays);
System.out.println(Arrays.toString(result));

}
}