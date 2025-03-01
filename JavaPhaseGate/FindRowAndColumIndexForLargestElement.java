public class FindRowAndColumIndexForLargestElement{
	public static int[] findRowAndColumIndexForLargestElement(int[][] arrays){
		int max = Integer.MIN_VALUE;
		int rowIndex = 0;
		int colIndex = 0;
		
		for(int i = 0; i < arrays.length; i++){
			
			for(int j = 0; j < arrays[i].length; j++){
			if(arrays[i][j] > max){
				max = arrays[i][j];
				rowIndex = i;
				colIndex = j;
			}
			}
		}
	return new int[]{rowIndex, colIndex};
	}




public static void main(String[] args){
	int[][] arrays = {
		{8,2,333}, 
		{4,5,6,899}
		
		};
	int[] index = findRowAndColumIndexForLargestElement(arrays);
	System.out.println(index[0] + " " + index[1]);
	

}
}