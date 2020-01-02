package day25Arrycontiniu;

import java.util.Arrays;

public class arryMethods {

public static void main(String[] args) {
	//arryin icindeki tek elementi print etmek icin arryi stringe
	//cevirmek lazim
//Arrys.toString(arr)//dersem aarry stringe cevirr
 int arr[]= {1,2,3};
System.out.println(arr);//hashcode verir	
	
	String str=Arrays.toString(arr);
System.out.println(str);

String names[]= {"celil","safa","sevim","saadet","ali"};
System.out.println(names[0]);
System.out.println(names);//hashcode
System.out.println(Arrays.toString(names));
//Arrys class is presented in java.util package
//shortcut write Arraysctrl space enter

//Arrays.sort(variableName);sort=siralamak..smallest to larger
//bunu statementa yazamazsin
//direk cevirir

int[]Numbers= {3,5,9,0,1,};
//Arrays.sort(Numbers);[01359];

Arrays.parallelSort(Numbers);
System.out.println(Arrays.toString(Numbers));
System.out.println("max"+Numbers[Numbers.length-1]);
System.out.println("min"+Numbers[0]);
//String siiralama
String[]Namelists= {"safa","celil","ibrahim","saadet"};
Arrays.sort(Namelists);//alfabe ye gore siralar(from AsCII table)

System.out.println(Arrays.toString(Namelists));
char[]ch= {'0','9','8','5','3'};
Arrays.sort(ch);
System.out.println(Arrays.toString(ch));
//herhangi bir degeri toplam print etmek icin stringe cevirmemiz lazim
//literal stringteki gibi direk variable yazamayiz hashcode verir
int[]nums = {4,5,6,8,3,67,89,-5};
//max kullanmak icin for kullaniyorduk kolay yolu sort
Arrays.sort(nums);//siraladi
System.out.println(Arrays.toString(nums));
System.out.println("min number"+nums[0]);
System.out.println("max numb"+nums[nums.length-1]);
System.out.println("second max numb"+nums[nums.length-2]);
System.out.println("second min numb"+nums[1]);
//write a prog print the in decsending order(largest to smaller)
int[]mynumbers= {99,10,100,4000,2000};
Arrays.sort(mynumbers);//step1[4000,2000,99,10] step1
                       //  index 0,1,2,3

for (int i =mynumbers.length-1;i>= 0 ; i--) { //step2
	
	System.out.print(mynumbers[i]+" ");//basinda ve sonunda arry //3
	                                  
	//braket olsun dersek for un icinde 10 kez calisir
	                                      
	//Arrys.tostring calismaz

}
//
int[]arry2={99,10,100,4000,2000};//decending largest to smaller
             //0,1,2,3,4
Arrays.sort(arry2);//

int[]decending=new int[arry2.length];
/*decending[0]=arry2[4];
decending[1]=arry2[3];
decending[2]=arry2[2];
decending[3]=arry2[1];
decending[4]=arry2[0];
*/
int z=0;
for (int i =arry2.length-1;i >=0; i--) {
	decending[z]=arry2[i];
             z++;
             
}     		
System.out.println("Acsending order:"+Arrays.toString(arry2));
System.out.println("Descending order:"+Arrays.toString(decending));            



}



}
