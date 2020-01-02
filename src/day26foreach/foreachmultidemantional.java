package day26foreach;

import java.util.Arrays;

public class foreachmultidemantional {

public static void main(String[] args) {
	
//tum multidem aaray icinformul
//n dimentional array conteins multiple(n-10dimentional arrays

int[]arr1D= {1,2,3,4};
int[][]arr2D= {  {3,4,5} ,{6,7,8,9}  };
                 //0          1
for (int i = 0; i < arr2D.length; i++) {//ilk dement ni sayar
	 for(int j=0;j<arr2D[i].length;j++) {
   System.out.print(arr2D[i][j]+" ");//ilk irakamlari j tum cumleyi tarar
	 }

}System.out.println();
//bunu each loopla nasil yapariz


for(int[] each1: arr2D) {
    for( int each2 :  each1) {
        System.out.print(each2+" ");
    }
}    
//                    0                 1
System.out.println();
String[][]str2D= { {"safa","saadet"},{"celil","ibrahim"} };
       for(String []say1:str2D) {
System.out.println(Arrays.toString(say1));//say1 veremeyiz iki tane iceriyor
       }                                   
//each volues of this statement istersem
//baska bir veriable create etmem lazim
       String[][]str1= { {"safa","saadet"},{"celil","ibrahim"} };
       for(String []yeni:str1) {
//System.out.println(Arrays.toString(say1));//
       for(String each:yeni) {
       System.out.print(each+"");
       } 
     }    
       
       int[][] num2D  =  { {1,2}, {3,4} };
       
       int[][][] num3D = {    { {1,2}, {3,4} } ,  { {5,6}, {7,8,9} }    };
       
       
       for(int[][] each2DArray : num3D ) {
           //  each2Darray: each 2 dimensional arrays that are contained with in the 3d array
           
           for(int[] each1DArray :  each2DArray ) {
               //  each1DArray:  each single dimensional arrays that are contained within 2d arrays
               
               for(int eachValues: each1DArray) {
                   //eachValues: each values that are contained with 1D arrays
                   System.out.print(eachValues +" ");
                   
                 
       
               }     

           }
       }

}            

}
               
               
                        

       

