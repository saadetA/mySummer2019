package day22While;

public class Warm2 {
    
    //1 2 FIN 4 RA FIND .... FINDRA   
        

public static void main(String[] args) {

String str ="";// "" + 1 + 2 + 3 + 4 + 5 ....+30
int i =1 ;

while(i <= 30 ) {
    /*
    if( i % 3 == 0 && i %5 ==0 ) {
        str += "FINRA ";
    }else if(i % 3 == 0  ) {
        str += "FIN ";
    }else if(i %5 ==0) {
        str += "RA ";
    }else {
        str += i +" ";
    }
    */
str += ( i % 3 == 0 && i %5 ==0 ) ? "FINRA " : 
    (i % 3 == 0  ) ? "FIN " : (i %5 ==0)? "RA " : i+" ";
    
    
    i++;
}


System.out.println(str);

       
}
}
