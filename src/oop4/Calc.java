package oop4;

public class Calc {

private int x;
private int y;

private int result;

public int getResult() {
	return result;
}

public void setY(int y){
    this.y = y;
}
public void setX(int x){
    this.x = x;
}
public void plus(){
    this.result = this.x+this.y;
}
public void minus(){
    this.result = this.x - this.y;

}
}
