package volkanistekmethod;

public class Method1 {
public static void main(String[] args) {
//method define edilir variabllar declare edilir
int sum = 0;
for (int i = 1; i <= 10; i++)
sum += i;
System.out.println("Sum from 1 to 10 is " + sum);
sum = 0;
for (int i = 20; i <= 37; i++)
sum += i;
System.out.println("Sum from 20 to 37 is " + sum);
sum = 0;
for (int i = 35; i <= 49; i++)
sum += i;
System.out.println("Sum from 35 to 49 is " + sum);		
method_debug.max(12, 20);//method_debug classindan max metd cagirdik

}
public static int sum(int i1, int i2) { 
	int result = 0;
	for (int i = i1; i <= i2; i++)
result += i; return result;
}
   

}








