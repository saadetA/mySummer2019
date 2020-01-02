package Day21While_do;

public class whileLoop {
public static void main(String[] args) {
int a=9;	
while(a>8) {
System.out.println("hi");//in loops body
a--;
}//a-- yi bodynin icine soutun onu veya arkasi farketmez
//
String sentence="i like book,i read book";
int count=0;
while(sentence.contains("book")) {
count++;                                 //book u iki kez gordukten sonra false olck
sentence=sentence.replaceFirst("book","");
}
System.out.println(count);
 System.out.println(sentence);
                              //break da kullanabiliriz durdurmak icin
 while(true) {
System.out.println("hi");
 break;
 }
 int i=0;//bodynin icine yazarsak surekli print eder
 while (true) {
i++;
System.out.println("hello:"+1);//hello 1
if(i<=5)
break;
}
//for ve while loop arasindaki fark while deinitilaze body disina
//iterator cond altina yazilmali

/*1-100 arasidaki cift rakamlar
for(int z=1;z<=100;z++) {
if(z%==0) {
System.out.println(z+" ");	
.............
*int z=1;
*while(z%==0){
*System.out.println(z+" ")
*z++;
*}
*/	
	

}
}
