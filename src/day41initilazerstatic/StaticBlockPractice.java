package day41initilazerstatic;
import java.util.ArrayList;
import java.util.Arrays;
public class StaticBlockPractice {

public static String name;
public static int[]arr1;	
public static ArrayList<String>students=new ArrayList();
public static String[]online= {"veysel","akif","mustafa","mekin"};
public static String[]inclass= {"ayse","sevim","saadet","sibel"};
public String grade;//instance
static {
	name="saadet";	
	arr1=new int[5];
   arr1[0]=1;
   arr1[2]=3;
students.addAll(Arrays.asList(online));

}
	static {
		name="celil";//artik saadet cikmaz celil print olur
	arr1=new int[3];//002
	arr1[2]=2;
	}
	static {
		name="safa";//celil cikmaz safa olur
	
	}
	//constractor yapalim
	

	public static void main(String[] args) {
	System.out.println(name);//null
StaticBlockPractice ob1=new StaticBlockPractice();
	System.out.println(Arrays.toString(arr1));
	// ArrayList<String>students=new ArrayList();
	System.out.println(students);
	// staticBlockPractice obj4=new staticBlockPractice();
	}

static {
students.addAll(Arrays.asList(inclass));//yukarda erkekleri eklemisti ilk staticte	



}                                       //burda kizlarida ekledi

public StaticBlockPractice(){//buraya instance veriable kullanieriz obj create etmeye gerek yo

	name="ibrahim";//object create etmeden print etmez//constrctr	
//grade="five";
System.out.println(name);
}	

}
