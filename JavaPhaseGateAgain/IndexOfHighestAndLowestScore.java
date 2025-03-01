import java.util.*;

public class IndexOfHighestAndLowestScore {
    public static int[] findIndexOfHighestAndLowestScore(int[][] arrays) {
       
        int max = 0;
        int min = Integer.MAX_VALUE;
        int indexMax = 0;
        int indexMin = 0;

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                if (arrays[i][j] > max) {
                    max = arrays[i][j];
                    indexMax = i;
                }
                if (arrays[i][j] < min) {
                    min = arrays[i][j];
                    indexMin = i;                 }
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