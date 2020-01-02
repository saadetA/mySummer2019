package REPL;

import java.util.*;

public class repl121 {
public static void main(String[] args) {





    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    
    String[] array = str.split(", ");
    
    
    int minValue = 100;
    for (int i = 0; i < array.length; i++){
        
      if (array[i].length() < minValue)
        minValue = array[i].length();  
    }
    
    int count = 0;
    for (int i = 0; i < array.length; i++){
      if (array[i].length() == minValue)
        count++;
    }
    
    String[] result = new String[count];
    int j = 0;
    for (int i = 0; i < array.length; i++){
      if (array[i].length() == minValue){
        result[j] = array[i];
        j++;
      }
    }
    Arrays.sort(result);
    System.out.println(Arrays.toString(result));
  }


}
