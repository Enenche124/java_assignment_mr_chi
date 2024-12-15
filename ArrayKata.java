public class ArrayKata{

    public static int largestElement(int[] integers){

 int largest = integers[0];

   for(int counter = 0; counter < integers.length; counter++){

     if(integers[counter] > largest){

       largest = integers[counter];


    }


  }

return largest;


}


  // TASK TWO ARRAYKATA


 public static int smallestElement(int[] smallestArray){

 int smallest = smallestArray[0];

   for(int counter = 0; counter < smallestArray.length; counter++){

     if(smallestArray[counter] < smallest){

       smallest = smallestArray[counter];


    }


  }

return smallest;

}



  // TASK THREE ARRAYKATA


 public static int sumOfElement(int[] sumOfArray){


int total = 0;

for(int j = 0; j < sumOfArray.length; j++){


total = total + sumOfArray[j];



   }
return total;


}



  // TASK FOUR ARRAYKATA


 public static int sumOfEvenNumbers(int[] sumOfEvenArray){


int sumOfEven = 0;

for(int i = 0; i < sumOfEvenArray.length; i++){

     if(sumOfEvenArray[i] % 2 == 0){

sumOfEven = sumOfEven + sumOfEvenArray[i];


}

   }
return sumOfEven;


}


  // TASK FIVE ARRAYKATA


 public static int sumOfOddNumbers(int[] sumOfOddArray){


int sumOfOdd = 0;

for(int counter = 0; counter < sumOfOddArray.length; counter++){

     if(sumOfOddArray[counter] % 2 != 0){

sumOfOdd = sumOfOdd + sumOfOddArray[counter];


}

   }
return sumOfOdd;


}






  // TASK SEVEN ARRAYKATA


 public static int numberOfOddNumbers(int[] numberOfOddNumbersArray){


int oddNumbers = 0;

for(int counter = 0; counter < numberOfOddNumbersArray.length; counter++){

     if(numberOfOddNumbersArray[counter] % 2 != 0){

oddNumbers++;
}

   }
return oddNumbers;


}





  // TASK EIGHT ARRAYKATA


 public static int numberOfEvenNumbers(int[] numberOfEvenNumbersArray){


int evenNumbers = 0;

for(int counter = 0; counter < numberOfEvenNumbersArray.length; counter++){

     if(numberOfEvenNumbersArray[counter] % 2 == 0){

evenNumbers++;
}

   }
return evenNumbers;


}





  // TASK SIX ARRAYKATA


 public static int[] maxAndMinArrayEl(int[] maxMinArray){


int max = maxMinArray[0];

int min = maxMinArray[0];


for(int counter = 0; counter < maxMinArray.length; counter++){

    if(maxMinArray[counter] > max){
      
      max = maxMinArray[counter];

   }else if(maxMinArray[counter] < min){
      
     min = maxMinArray[counter];

   }

 
 }

return new int[]{max, min};
}




  // TASK ELEVEN ARRAYKATA

 public static int[] squaredArrayNumber(int[] squareArray){

//for(int counter = 0; counter < squareArray.length; counter++){

    int sq1 = squareArray[0] * squareArray[0];

    int sq2 = squareArray[1] * squareArray[1];

    int sq3 = squareArray[2] * squareArray[2];

    int sq4 = squareArray[3] * squareArray[3];

    int sq5 = squareArray[4] * squareArray[4];


 
 //} 

return new int[]{sq1, sq2, sq3, sq4, sq5};
}








public static void main(String[] args){


int[] taskOneLists = {8, 77, 99, 30, 20};

System.out.println("The largest element in  the Array is -> " + largestElement(taskOneLists));

System.out.println("The smallest element in  the Array is ->  " + smallestElement(taskOneLists));

 System.out.println("The sum of the element in  the Array is ->  " + sumOfElement(taskOneLists));

System.out.println("The sum of even numbers in  the Array is ->  " + sumOfEvenNumbers(taskOneLists));

System.out.println("The sum of odd numbers in  the Array is ->  " + sumOfOddNumbers(taskOneLists));

System.out.println("The number of Odd numbers in  the Array is ->  " + numberOfOddNumbers(taskOneLists));

System.out.println("The number of Even numbers in  the Array is ->  " + numberOfEvenNumbers(taskOneLists));

int[] result = maxAndMinArrayEl(taskOneLists);
System.out.println("The maximum and minimum Array is ->  " + "{" + result[0] + "," + result[1] + "}");

int[] result1 = squaredArrayNumber(taskOneLists);
System.out.println("The Array of all square numbers  is ->  " + "{" + result1[0] + "," + result1[1] + "," + result1[2] + "," + result1[3] + "," + result1[4] + "}");








   }
 }