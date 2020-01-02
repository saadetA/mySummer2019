package replArrylist_methods;

import java.util.ArrayList;

public class AL_repeatAll {

public static void main(String[] args) {
//ArrayList <Boolean>a=new ArrayList<>();
}

public static void repeatAL(ArrayList<Boolean> a){
    // add() --> adds an object to an arrayList
    // get(index) --> that will return the object in the indicated index
    int initialSize = a.size(); // initialSize = 3;
    for(int i = 0; i <initialSize ; i++){
        // arraylist size is dynamic
        a.add(a.get(i)); // size is getting increased
    }


}







}
