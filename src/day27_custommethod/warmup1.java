package day27_custommethod;

import java.util.Arrays;

public class warmup1 {
public static void main(String[] args) {
	int[]numbers ;
numbers=new int[100];//veya//i<100
for (int i = 1; i <=100; i++) {
	numbers[i-1]=i;//veyanumbers[i]=i+1
}
System.out.println(Arrays.toString(numbers));
for(int yeni:numbers) {
if(yeni%2==0) {// contin cift sayilar gelince atla
	continue;  //ifi nereye koydugumuz onemli
}System.out.print(yeni+" ");// two demantional olsa braket koyardik
}                         //int[i]
//continiu skip next iterator

    //custom methods(grup of statements)methods==function
     //cok kullanacaksiniz can make our code reusuable(dont need to
//repeat the same set of statements)
// decleration method public static void main=one method
//public=acces modifir 
//static=specifier
//void=return-type
//main=method name
//{} all them one method
//acces-modfiers:bu kursta ogreneceklerimiz public,protected,default,private
//specifiers;static,abstract,final
//return type;void and any other data types(int double)
//ya void  methods doesnot return any volue


}
}
