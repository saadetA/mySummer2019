package day26foreach;

import java.util.Arrays;

public class continiuestatement {
public static void main(String[] args) {
	
//continiue used for skipping the current statement

for (int i = 0; i < 5; i++) {
	System.out.print(i+" ");
if(i>2) {//2 ye gelince printi atla sonra devam et  
continue;                     //1 for 2 if 3 cont 4 sout
                             //continue sout dan once yaz
                             //loop da first come executed
}
System.out.println(i+" ");
}
System.out.println();
int[] numers = {1,2,3,4,5};

for(int i =0; i < numers.length; i++) {
    
    if(numers[i] < 3) {
        continue;
    }
    
    System.out.print(numers[i] +" ");
    
    /*
    if(numers[i] < 3) {
        continue;
    }       
    */
    
}
    
    














}





}
