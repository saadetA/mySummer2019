package day25Arrycontiniu;

public class warmUp2 {
public static void main(String[] args) {
	//2. Write a program that can print out the unique values from  String Array
	//1 A harfi kac kez var.2.uniq harflri bul
	
	String[]arr= {"A","A","B","C","C"};	

	
	for (int j= 0; j < arr.length; j++) {//6  i yi j yapiyor
		                                 //tamanin kapsiyor
	
	int count=0;//1
for (int i = 0; i < arr.length; i++) {//2
	if(arr[i].equals("A")){//3   //7equals"A" arr[j] yapiyor
	count++;//4
	}
}
	System.out.println(count);//5//8arr[j]soruyor boylece tamamini taratmis oluyor


}







}
}
