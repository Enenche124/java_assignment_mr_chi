import java.util.Arrays;
public class DescendingOrder{
    
	public static int[] descendingOrder(int[] numbers){
		Arrays.sort(numbers);
		int i;
		for(i = 0; i < numbers.length; i--){
			System.out.println(numbers[-i]);
			
		}
		return new int[] {numbers[-i]};
		
	}
		public static void main(String[] args){
			int[] numbers = {2, 5, 8, 9};
			int[] result = descendingOrder(numbers);
			descendingOrder(result);
		}
		}