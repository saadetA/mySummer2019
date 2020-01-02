package palondrame_reverse;

public class palindrome2 {
public static void main(String[] args) {
	int [] arr = {1,2,3,5,2,1};
int head=0; int tail=arr.length-1;//step1
//step2
int count=0;

while(head<tail) {
	if(arr[head]!=arr[tail]) {
	count++;	
	}
head++;
tail--;
}
if(count>0) {
	System.out.println("NOT PALINDROME");
}else
	System.out.println("PALINDROME");

}

}












