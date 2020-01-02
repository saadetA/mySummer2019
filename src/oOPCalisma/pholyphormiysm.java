package oOPCalisma;
class Cat{
    
    private String name;
    private int age;
    
    
    //default constructor
    public Cat() {
       // this.name = "İsim değeri girilmedi";
       // this.age = 0;
    }
    
    //params constructor
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    //getter
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    public void ioCat(){
        System.out.println("Kedimizin adı: " + this.getName()
                + "\nKedimizin yaşı: " + this.getAge() + "\n");
    }
    
}











public class pholyphormiysm {
public static void main(String[] args) {
	 // main method
    /*
    Cat cat1, cat2, cat3;
    
    cat1 = new Cat("Tarçın", 2);
   cat2 = new VanCat("Mesir", 3, true);
    cat3 = new VanCat("Macun", 4, false);
    
    cat1.ioCat();
    cat2.ioCat();
    cat3.ioCat();
*/
}
}
