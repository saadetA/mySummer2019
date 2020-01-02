package REPL;

public class Repl161 {
/*
This method calculates a water bill, the method gets a double and returns a double.

The more water you use the more it will cost you (as a fine for wasting water).

for example:

waterTax(50)
returns 30

waterTax(55)
returns 49.5

waterTax(101)
returns 140.9

waterTax(151)
returns 235.9

the regular calculation under 50 is 
bill = units * 0.60;
above 50 is:
bill = units * 0.90;





*/
	public static void main(String[] args) {
        System.out.println(waterTax(50));
        System.out.println(waterTax(55));
        System.out.println(waterTax(101));
        System.out.println(waterTax(151));
    }

    public static double waterTax(double units){
        //if <50 : bill = units * 0.60;
        double bill = 0.0;
        if(units<=50){
            bill = units*0.6;
        }else if(units <=100){
            bill = units*0.9;
        }else if(units<=150){
            bill = (units*0.9) +50;
        }else {
            bill = (units*0.9) +100;
        }

       return bill;


}




}
