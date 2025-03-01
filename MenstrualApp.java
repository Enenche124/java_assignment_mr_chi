import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenstrualApp{
       private List<Start> starts;
	   private List<End> ends;
	   private List<Symptom> symptoms;
	   private List<Flowlevel> flowLevels;
	   
	   public MenstrualApp(){
		  
      starts = new ArrayList<>();
      ends = new ArrayList<>();	
      symptoms = new ArrayList<>();	
      flowLevels = new ArrayList<>();	       
		   
	   }
	   
	   public void printStartDate(Start starter){
	   starts.add(starter);

	   }
	   
	    public void printEnd(End ender){
	   ends.add(ender);

	   }
	    public void printSymptoms(Symptom symptomu){
	   symptoms.add(symptomu);

	   }
	    public void printFlow(Flowlevel flowLeveler){
	   flowLevels.add(flowLeveler);

	   }
	   
	   
	   
	   
	   public static void main(String[] args){
		   
		   MenstrualApp menstrual = new MenstrualApp();
		   Scanner receiver = new Scanner(System.in);
		   
		   while(true){
			   
			   System.out.println("1. add start");
			    System.out.println("2. add end");
				 System.out.println("3. add symptoms");
				  System.out.println("4. add flowLevel");
				  
				
		   }
		   
	   }
}