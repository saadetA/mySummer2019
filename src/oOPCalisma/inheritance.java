package oOPCalisma;


class Car{
	//field
		public int door;
		public int wheel;
		public int engine;
		         int speed;
//methods
public void speed(int speed) {
	
	System.out.println("arabanin hizi:"+speed);
if(this.speed==10) {
	System.out.println("araba clisti");
	this.speed+=speed;
}


}
public int door() {
	System.out.println("Arabanin kapi sayisi: "+door);
	
	return door;
} 

public int stop() {
	
	if(this.speed<=0) {
		this.speed=0;
		System.out.println("Arac durdu");
	}

return this.speed;
}

//main constractor
public Car() {
	this.door=4;
	this.speed=40;		
	this.wheel=4;		
	this.engine=1;		


}
//parametreli constractor
public Car(int door,int speed,int wheel,int engine) {
	
this.door=door;
this.speed=speed;
this.wheel=wheel;
this.engine=engine;

}
//all veriable getter

public int getdoor() {
	return door;
}

public int getspeed() {
	return speed;
}
public int getEngine() {
	return engine;
}
public int getSpeed() {
	return speed;
}
//allvariable setter

public void setDoor(int door) {
	this.door = door;
}
public void setWheel(int wheel) {
	this.wheel = wheel;
}
public void setEngine(int engine) {
	this.engine = engine;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
//araba sinifindan uretilen mercedes sinifimiz inheritance

 class Mercedes extends Car{
	
}






}


public class inheritance {
public static void main(String[] args) {
	
	//Mercedes 320=new Mercedes();



}



}








