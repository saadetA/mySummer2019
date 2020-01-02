package REPL;
import java.util.*;
public class repl84zombi {


  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int inhabitants = scan.nextInt();
    
    
      if(inhabitants==0) {
                System.out.println("---- EXTINCT ----");
            }
            else {          
                int b =inhabitants;     
                for(int c=0;0<b;c++) 
                {       
                    System.out.println("Day "+c+" ["+b+"]");
                      b=b/2;
                 }  
                System.out.println("---- EXTINCT ----");  
            }
    
  }
}
