public class SecondReversedString{

    public static String secondReversedString(String letters){
		
		String reversed = "";
		for(int i = letters.length() -1; i >= 0;  i--){
			reversed = reversed + letters.charAt(i);
		}
		return reversed;
	}
public static void main(String[] args){
	
	String str = secondReversedString("How are you");
	
	System.out.println(str);
}
}