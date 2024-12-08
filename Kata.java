public class Kata{

     public static boolean taskOne(int number){

if (number % 2 == 0){

return true;

}else{

return false;

  }
}



  public static boolean taskTwo(int number){
   
   if(number / number == 1){

 return true;

}else{

return false;

  }

 }


  public static int taskThree(int firstNumber, int secondNumber){        

      return Math.abs(firstNumber - secondNumber);


   }


  public static float taskFour(int firstInteger, int secondInteger){        

     if(secondInteger == 0){
      return 0;
  }else{
   return firstInteger / secondInteger;
  }

}


  public static int taskFive(int numbers){        

        int counter = 0;


for(int counting = 1; counting <= numbers; counting++){

      if(numbers % counting == 0){

       counter++;
}

}
  
return counter;

}


public static boolean taskSix(int number){
 
     int getTheSquare  = (int) Math.sqrt(number);

    return getTheSquare * getTheSquare == number;
 
}


public static int taskEight(int number){

 if(number == 0 || number == 1){

return 1;

}else{

int total = 1;

for(int j = 2; j <= number; j++){

total = total * j;

}
return total;

}
 
}


public static int taskNine(int number){
 
    return number * number;
 
}


 public static void main(String[] args){

System.out.println(taskOne(5));
System.out.println(taskOne(10));

System.out.println(taskTwo(11));

System.out.println(taskThree(3, 7));
System.out.println(taskThree(7, 3));


System.out.println(taskFour(15, 3));
System.out.println(taskFour(15, 0));

System.out.println(taskFive(10));
System.out.println(taskSix(25));
System.out.println(taskEight(5));
System.out.println(taskNine(5));


}

}