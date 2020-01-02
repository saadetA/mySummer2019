package day48Overriding;

class WebDriver{//super class

	public void get() {
	System.out.println("open Browser");
}	
}


class ChromeDriver extends WebDriver{
@Override
	public void get() {
System.out.println("open chrome browser");	
}	
}


class FireFoxDriver extends WebDriver{
	@Override
	public void get() {//only instance methd can be overriding //static methd cant be overridng
		System.out.println("open Firefox browser");//firefox yaptik	
		}		                                    //final olunca da override olmaz degskl yapayiz
}                                                   //private cant be override inhrtb olmd icin
//override ancak sub classin icinde yapabiliriz



public class Practice {
public static void main(String[] args) {
	ChromeDriver driver1=new ChromeDriver();
              driver1.get();//chrome acsin istersem yeni fonks eklemek
              //istersem override yaparim
              FireFoxDriver driver2=new FireFoxDriver();
                          driver2.get();

}
}
