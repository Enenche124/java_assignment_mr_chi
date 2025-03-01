import java.util.*;

public class PracticeNight{
	
		
		public static int[] reversesal(int[] arrays){
			
			for(int i = 0; i < arrays.length; i++){
				
			}
			int[] arr = new int[arrays.length];
			int k = 0;
			for(int i = arrays.length -1; i >= 0; i--){
             arr[k] = arrays[i];
			 k++;	
			}
			
			return arr;
		}
		
		
		
		
		public static void main(String[] args){
			Scanner receiver = new Scanner(System.in);
			int[] arrays = {100, 200, 300, 10};
			int[] result = reversesal(arrays);
			System.out.println(Arrays.toString(result));
			
			System.out.print("Enter num1 ");
			int num1 = receiver.nextInt();
			System.out.print("Enter num2 ");
			int num2 = receiver.nextInt();
			int sk =  num2 num1;
			
			System.out.println(num1);
			
	
	}
	
	
}












import java.util.*;

public class IndexOfHighestAndLowestScore {
    public static int[] findIndexOfHighestAndLowestScore(int[][] arrays) {
        if (arrays == null || arrays.length == 0) {
            return new int[]{-1, -1}; // Return -1 if the input array is empty or null
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int indexMax = 0;
        int indexMin = 0;

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if (arrays[i][j] > max) {
                    max = arrays[i][j];
                    indexMax = i; // Store the row index of the max value
                }
                if (arrays[i][j] < min) {
                    min = arrays[i][j];
                    indexMin = i; // Store the row index of the min value
                }
            }
        }

        return new int[]{indexMin, indexMax};
    }

    public static void main(String[] args) {
        int[][] arrays = {
            {10, 30, 50},
            {5, 10, 50}
        };
        int index[] = findIndexOfHighestAndLowestScore(arrays);
        System.out.println(Arrays.toString(index));
    }
}






















