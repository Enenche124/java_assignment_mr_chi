public class LengthOfLastWordInString{
	
	public static int lengthOfLastWordInString(String letters){
	
	
	
		if(letters == null){
			System.out.println("Error"); 
			
		}
		return letters.charAt(letters.length() -1);
	}
	
	
	

		public static void main(String[] args){

	
	System.out.println(lengthOfLastWordInString(" str hmm okay guy "));
	
	
	}
}