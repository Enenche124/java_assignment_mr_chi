public class GreatestCommonDivisor{

	public static int greatestDivisor(int num1, int num2){

         if(num2 == 0){
     
           return num1;
}else {

return greatestDivisor(num2, num1 % num2);
}



 }

public static void main(String[] args){

int result = greatestDivisor(125, 2525);
System.out.println(result);

}

}