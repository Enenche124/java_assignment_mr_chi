import java.util.*;
public class TwoSmallest{

  public static int[] findTwoSmallest(int[] arrays){
  int firstSmallest = arrays[0];
  int secondSmallest = arrays[1];


  for(int i = 0; i < arrays.length; i++){
  if(arrays[i] < firstSmallest){
  secondSmallest = firstSmallest;
  firstSmallest = arrays[i];

}
if(arrays[i] != firstSmallest && arrays[i] < secondSmallest){
secondSmallest = arrays[i];
}
}
return new int[]{firstSmallest, secondSmallest};
}


public static void main(String[] args){
int[] arrays = {2, 2, 1, 0, -1};
int[] result = findTwoSmallest(arrays);
System.out.println(Arrays.toString(result));

}
}