package day48Overriding;

public class Mahribana {
 
	
	public void methodA() {//private veremeyiz inherit etmek icin default public veya protected olur   
        // the method we are going to override MUST be inheritable to the sub class
        System.out.println("Method A");
    }
    public String methodB() {
    	return"B";
    }
//ayni classta override yapamayiz	
	
	protected double salary(double bonus) {//overriding name=same parameter datatype must be same 
		                               //parameter name can be change
	return bonus +1000000;
	}
	
    
    
    
    public static void main(String[] args) {
		 Mahribana obj=new Mahribana();
		 AccessModifiers obj2 =new AccessModifiers ();
	 
	 }   



public class AccessModifiers extends Mahribana {
    /*//     sub                  //super
    @Override
    private void methodA() {
        System.out.println("Method A");
    }
        override method' access modifiers need to be same or more visible
    */  
    
    @Override
    public void methodA() {//accmodifrs must be same or more visible
        System.out.println("Method A");
    }



}

}


