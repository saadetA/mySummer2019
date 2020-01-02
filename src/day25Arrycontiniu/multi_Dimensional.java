package day25Arrycontiniu;

import java.util.Arrays;

public class multi_Dimensional {
public static void main(String[] args) {
	//int[]arr1D= {1,2,3};
//1dimens arry
int[][]arr2D= {  {1,2,3}  ,{4,5,6}  };

String[]arr= {"A","B"};
//                   0   1     0    1
String[][]str2D= { {"A","B"} ,{"C","D"}  };
//   []  ilk braket    indeks...ikinci[]indek....
//                      0             1

//printA

System.out.println(str2D[0][0]);//printA
System.out.println(str2D[0][1]);//printB
System.out.println(str2D[1][0]);//printC
System.out.println(str2D[1][1]);//printD
//print[A,B];icin
System.out.println(str2D[0]);//hachcode
System.out.println(Arrays.toString(str2D[0]));
//printC D
System.out.println(Arrays.toString(str2D[1]));
//ABCD icin Arrays.deepToString(str2D)
//System.out.println(Arrays.toString(str2D));hascode
System.out.println(Arrays.deepToString(str2D));
//                    0,1   0,1,2 0,1,2,3
int[][]numbers2D= {  {1,2},{3,4},{5,6,7}  };
//                     0     1      2
System.out.println((numbers2D[0][0]));
System.out.println((numbers2D[2][1]));
System.out.println((numbers2D[2][2]));
System.out.println((numbers2D[2][2]));


System.out.println((numbers2D[2]));//yanlis
System.out.println(Arrays.deepToString(numbers2D));//3,4
//                      0    1           0    1    
int[][][]Array3D= { { {1,2},{3,4} },{  {5,6},{7,8} }  };//3 braket da iki demns arry var
//                         0                1 
System.out.println(Array3D[1][1][1]);//8
System.out.println(Array3D[1][0]);//yanls
System.out.println(Arrays.toString(Array3D[1][0]));//ikisi icin tostring
System.out.println(Arrays.deepToString(Array3D[1]));//5678
System.out.println(Arrays.deepToString(Array3D));













}
}