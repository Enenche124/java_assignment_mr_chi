public class PowerOfTwo{
	
	public  static boolean powerOfTwo(int num1, int num2){
		
		if(num2 == 0){
		System.out.println("Error");
		}
		
		return num2 != 0 && num1 % num2 == 0;


	}
	
	
	public static void main(String[] args){
		System.out.println(powerOfTwo(2, 20));
	}
}