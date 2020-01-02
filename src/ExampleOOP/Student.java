package ExampleOOP;

public class Student {

	int id;
	String firstName;
	String lastName;
	int birthYear, birthMonth, birthDay;
	boolean grade;

	public  Student() {
		this(true);
		System.out.println("bos constrctr");
	}
	
	public Student (int id,String firstName,String lastName) {
		this.id=id;
	this.firstName=firstName;
	this.lastName=lastName;
	//System.out.println("my studets info "+firstName);
	
	}
	
	public Student(boolean grade) {
		
		this.grade=grade;
	System.out.println("ibrahims birthday");
	
	}
	
	
	boolean isBirthDay() {
		// return true if students birhfday today
		return false;
	}

	void givewarning() {
		// you should study harder
	}

	int numberOfFriends() {
//returns the number of students friends	

		return 0;
	}

	boolean passExam() {
		// return true if grades>80
		return true;
	}

	
	

	
	public static void main(String[] args) {//baska class olusturup maini orda create etmek 
		                                   //daha mantikli info student gibi
		Student myFirstStudent = new Student();
		Student secondStudent = new Student(15,"Ayse","Fatma");
        Student thirdStudent=new Student(true);
	//Student info=new Student(15,"ayse","safa");
        
        myFirstStudent.id=1234;
	
	secondStudent.id=5678;
	
	myFirstStudent.firstName="safa";
	//secondStudent.firstName="celil";
	thirdStudent.firstName="ibrahim";
	
	System.out.println("we are so glad to meet our new students  "+myFirstStudent.firstName);
	System.out.println("my constractor with parameters"+secondStudent.id+" "+secondStudent.firstName+" "+
	secondStudent.lastName);
	
	System.out.println("ibrahim's birthday is "+thirdStudent.grade);
	
	}

	}






