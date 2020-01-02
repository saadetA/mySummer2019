package palondrame_reverse;

public class reverseStringbuilder {
public static void main(String[] args) {
	String str="merhaba";

StringBuilder sb=new StringBuilder(str);
System.out.println(sb.reverse());
System.out.println(sb);
System.out.println(ispalondrame("nurses run"));
System.out.println(ispalindrame("noon") );

}
public static boolean  ispalondrame(String check) {
	int head=0;int tail=check.length()-1;int count=0;
String[] arr=check.split(" ");
while(head>0) {
if(!arr[head].equalsIgnoreCase(arr[tail])) {
	count++;
}	
head++;
tail--;
if(count>0)
	//System.out.println("not palondram");
	return false;

}
return true;
}

public static boolean ispalindrame(String chek) {
	String reverse="";
	chek=chek.replace(" ", "");
chek=chek.toLowerCase();
for (int i = chek.length()-1; i >=0 ; i--) {
	reverse+=""+chek.charAt(i);
if(chek.equals(reverse)) {
	return true;	
}



}
return false;



}





}
