package rhn;

public class getduplicate {
	public static int getDup(String[] r) 
    {
       int countDublicates =0;
          String temp = "";
          for(String each1: r){
              int counter =0;
              for(String each2: r){
                  if(each1.equals(each2)){
                      counter++;
                  }
              }
              if(counter >1){
                  if(!temp.contains(each1)){
                      temp += each1;
                      countDublicates += counter;
                  }
              }
          }   
          return countDublicates;
}
}