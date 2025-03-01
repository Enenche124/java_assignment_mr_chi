public class Palindrome{
	
	public  static boolean palindrome(int digits){
		int actual = digits;
		int remainder = 0;
		
		
		while(actual != 0){
			
			remainder = (remainder * 10) + (actual % 10);
			actual = actual / 10;
		}
		
		return remainder == digits;
	
	}
	
	    
       

	public static void main(String[] args){
		System.out.println(palindrome(3131313));
	}
}