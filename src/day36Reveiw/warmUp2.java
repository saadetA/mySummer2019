package day36Reveiw;
import java.util.ArrayList;
import java.util.Arrays;
public class warmUp2 {

	//2. write a return method that can remove the
	//duplicated objects from a String arraylist

	public static void main(String[] args) {
String[]names= {"ali","veli","ayse","ali",};	
ArrayList<String>list3=new ArrayList(Arrays.asList(names));
System.out.println(list3);
ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4,4,5,5,6,6));
System.out.println(list2);

   // list2 = RemoveDup(list2);
    
    System.out.println(list2);
    

}

public static ArrayList<String>  RemoveDup2 ( ArrayList<String>  list ){
    ArrayList<String> result = new ArrayList<>();  //[1,2,3]
    
    for(int i=0; i < list.size(); i++ ) {
        if( ! result.contains( list.get(i) )  ) {
            result.add( list.get(i)  );
        }
    }

    return result;
}


	




 
}
