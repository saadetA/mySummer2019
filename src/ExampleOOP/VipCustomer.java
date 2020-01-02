package ExampleOOP;

public class VipCustomer {

	// Create a new class VipCustomer
    // it should have 3 fields(instance variables) name, credit limit, and email address.
    // create 3 constructors
    // 1st --> constructor empty(no parameters) should call the constructor with 3 parameters with default values
    // 2nd constructor should pass on the 2 values it receives(2 parameters) and add a default value for the 3rd
    // 3rd constructor should save all fields(contains all parameters)
    // create getters only for this using code generation of intellij as setters wont be needed
    // test and confirm it works.


private String name;

private long creditlimit; 

private String email;


public VipCustomer() {
this("saadet",123445l,"saade@gmail");	
System.out.println("your information is ");
}


public VipCustomer(String email) {
	
}

public VipCustomer(String name,long creditlimit,String email) {
this.name=name;
this.creditlimit=creditlimit;	
this.email=email;	
	System.out.println("these are your information  "+name+creditlimit+email);	
}

public static void main(String[] args) {
	VipCustomer customer1=new VipCustomer();
}




}
