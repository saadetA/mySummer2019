package day35warmupconstractor;
import java.util.ArrayList;
import java.util.Arrays;
public class wurmup3 {

public static void main(String[] args) {

ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList( 10, 20, 35, 30, 35));
            
        int secondMaximum  = SecondMax(list4);  // 30
            
            System.out.println( secondMaximum );

}
// task03
public static int SecondMax ( ArrayList<Integer> list) {
                                //  [90, 95, 100, 100]
    Integer max = MaxNum( list ); // 100,   auto boxing
    
        list.removeAll( Arrays.asList(max) );   // [90, 95]
        
    int secondMax = MaxNum(list);  //95
    
    
    return secondMax;
    
}
private static Integer MaxNum(ArrayList<Integer> list) {
	// TODO Auto-generated method stub
	return null;
}

 
}
