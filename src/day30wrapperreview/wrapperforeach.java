package day30wrapperreview;
import java.util.*;
public class wrapperforeach {
//Arrays reveiew
public static void main(String[] args) {
	
//int num=0;

//int[]arr= {  10};//size 10 demek degismez 10 tane elemani var demek 
                  //fix degismez

//arr[0]=20;//
//System.out.println(arr[0]);//arr size 10 un ilk indeksi

//int[]arr2=new int[2];//[0,0]sadece size verdi volue yok oyuzden0
                   // arr2ninmax kapasitesi 2 eleman

//System.out.println(arr[0]);//0
//System.out.println(arr[1]);//0
String[] cars=new String[5];//this aary can contain 5 volues
//{vosvos,audi,toyota,jeap,nissan}

cars[4]="nissan";
cars[3]="jeap";
cars[2]="toyota";
cars[1]="auidi";
cars[0]="vosvos";

for(int i=0;i<cars.length;i++) {
	System.out.print(cars[i]+" ");
}
//veya cars=new String[10]
//dersek oncekiler 0 cikar
boolean []bool= {10>9,6>4};//veya 10<5 den de yazabiliriz true veya false olan her cond verilir
boolean b1=bool[0];//true
boolean b2=bool[1];
System.out.println(bool);//hashcode
String str=Arrays.toString(bool);

System.out.println(str);
//Arrays.sort(|):
            //--->......veriable
double []darray= {10,20,30,40};
System.out.println(Arrays.toString(darray));
Arrays.sort(darray);//ascending order kucukten buyuge
System.out.println(Arrays.toString(darray));
//buyukten kucuge istenirse  decending order
//once sort edip sonra regular for la reverse yapcz
int[]numbers= {200,300,20,7890,-20,-2};
Arrays.sort(numbers);
System.out.println(Arrays.toString(numbers));//for everse
String result="";
for (int i = numbers.length-1; i >=0; i--) {
	

result += numbers[i] +", ";
}

//  result = result.trim();
// result =  result.replace("-100,", "-100");//herzaman kullanamazsiiz
result = result.substring(0, result.lastIndexOf(",") );
System.out.println(result);












    

}










}





