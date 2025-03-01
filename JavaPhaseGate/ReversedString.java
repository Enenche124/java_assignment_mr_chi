public class ReversedString{
	public static String reversed(String letters){
		String reversed = "";
		for(int i = letters.length()-1; i >= 0; i--){
			
			reversed += letters.charAt(i);
			}
		return reversed;
	}




public static void main(String[] args){
	String str = reversedOrder("ABCD");
	System.out.println(str);
}
}