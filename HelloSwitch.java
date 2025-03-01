import java.util.Scanner;

public class HelloSwitch{

     public static void main(String[] args){


  Scanner userInput = new Scanner(System.in);

int grade;
int total = 0;
int gradeCounter = 0;
int gradeA = 0;
int gradeB = 0;
int gradeC = 0;
int gradeD = 0;
int gradeF = 0;
double average = 0;


System.out.printf("%s%n%s%n  %s%n  %s%n",
"Enter grade between 0 to 100",
"Type the end-of-file indicator to terminate input:",
"On UNIX, MacOS, Linux type Ctrl d key and press enter key",
"On Windows press Ctrl z and press enter key");

while(userInput.hasNext()){
grade = userInput.nextInt();
total += grade;
gradeCounter++;


switch(grade / 10){

case 10:
case 9:
++gradeA;
break;
case 8:
++gradeB;
break;
case 7:
++gradeC;
break;
case 6:
++gradeD;
break;
default:
++gradeF;
break;
}

}

System.out.printf("%n Grade Report: %n");
System.out.println();


if(gradeCounter != 0){
average = (double) total / gradeCounter;

}
System.out.printf("Total of the %d grade entered is: %d%n", gradeCounter, total);
System.out.println();

System.out.printf("Class average is: %.2f%n", average);
System.out.println();

System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
"Number of student who receive each grade: ",
"A: ", gradeA,
"B: ", gradeB,
"C: ", gradeC,
"D: ", gradeD,
"F: ", gradeF);



  }
}