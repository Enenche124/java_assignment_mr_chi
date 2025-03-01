import java.util.*;

public class Students{
   public static void main(String[] args){
	   
	   Scanner value = new Scanner(System.in);




           int highestScoring = Integer.MIN_VALUE;
           int lowestScoring = Integer.MAX_VALUE;
	   int highStudent = 0;
	   int lowStudent = 0;
           int failure = 40;
           int pass = 100;
          int easySub = 0;
	  int hardSub = 0;


	   
	   System.out.println("How many student do you have?");
	   int numOfStudents = value.nextInt();
	   
	   System.out.println("How many subject do they offer?");
	   int numOfSubjects = value.nextInt();

	   System.out.printf("%s%n%s%n%n","Saving >>>>>>>>>>>>>>>>>>>>>>>>>", "Saved successfully");



	 
	   
	   int[][] studentScores = new int [numOfStudents][numOfSubjects];


	   
	   for(int student = 0; student < numOfStudents; student++){

		   System.out.println("Entering score for student " + (student + 1));

		   for(int subject = 0; subject < numOfSubjects; subject++){

			   System.out.println("Enter score for subject " + (subject + 1));

			   studentScores[student][subject] = value.nextInt();

	             System.out.printf("%s %n %s %n %n","Saving >>>>>>>>>>>>>>>>>>>>>>>>>", "Saved successfully");



			   
		   }
		   
	   }
  

	   int [] eachTotal = new int [numOfStudents];
	   double [] eachAverage = new double [numOfStudents];
	   
	   for(int student = 0; student < numOfStudents; student++){
		   for(int subject = 0; subject < numOfSubjects; subject++){
			   eachTotal[student] += studentScores[student][subject];
		   }
		   eachAverage[student] = (double) eachTotal[student] / numOfSubjects;
	   }
	   


	   int [] eachPosition = new int [numOfStudents];
	   
	   for(int student = 0; student < numOfStudents; student++){
		   int position = 1;
		   for(int check = 0; check < numOfStudents; check++){
			   if(eachAverage[student] < eachAverage[check]){
				   position++;
			   }
			    eachPosition[student] = position;
		   }
		  
	   }
	   
	  System.out.println("=============================================================================================");
	  System.out.printf("%-10s", "STUDENT");
	  
   for(int sub = 1; sub <= numOfSubjects; sub++){
	   System.out.printf("%-10s","SUB" + sub );
   }
    System.out.printf("%-10s %-10s %-10s\n", "TOT", "AVG", "POS");
    System.out.println("================================================================================================");
	 
	 
	 for(int student = 0; student < numOfStudents; student++){
	System.out.printf("%-10s ", "Student " + (student + 1));
	
	for(int subject = 0; subject < numOfSubjects; subject++){
	System.out.printf("%-10d", + studentScores[student][subject]);
	}
    System.out.printf("%-10d %-10.2f %-10d\n%n", eachTotal[student], eachAverage[student], eachPosition[student]); 
	
	 }





    for(int i = 0; i < numOfSubjects; i++){
    int numOfFails = 0;
    int numOfPass = 0;

   for(int j = 0; j < numOfSubjects; j++){

      if(studentScores[i][j] > failure){
	numOfFails++;
}else{
numOfPass++;

}

     if(studentScores[i][j] > highestScoring){
       highestScoring = studentScores[i][j];
       highStudent = i + 1;;
	   
}

     if(studentScores[i][j] < lowestScoring){
       lowestScoring = studentScores[i][j];
       lowStudent++;	   
  }
}
if(numOfFails > numOfPass){
  hardSub = i;

}else{
easySub = i;

}
}




System.out.println("SUMMARY");
for(int i = 0; i < numOfSubjects; i++){
System.out.println("Subject: " + (i + 1));
for(int j = 0; j < numOfStudents; j++){
System.out.printf("%s %d %s %d%n", "Highest scoring student is: Student", highStudent, "Scoring", highestScoring);
}

}
	   
   }
}