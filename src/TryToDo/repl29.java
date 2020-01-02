package TryToDo;


	import java.util.*;

	 class Main {
	  public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in); 
	    int seniorCitizens,nonSeniorCitizens,age;
	  System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");  
	  seniorCitizens=scan.nextInt();
	  nonSeniorCitizens=scan.nextInt();
	  System.out.println("What is new citizen's age?");
	    age=scan.nextInt();
	    scan.nextLine();
	  if(age>=65){
		  seniorCitizens+= 1; 
		  System.out.println("Senior Citizen");  
	  
	    
	  }  
	  else if(age<65){  
		  nonSeniorCitizens+=1;
		  System.out.println("Non-Senior Citizen");  
	    
	  }
	  System.out.println("New seniorCitizens count "+" "+seniorCitizens);  
	  System.out.println("New nonSeniorCitizens count"+" "+nonSeniorCitizens);   
	  }

}