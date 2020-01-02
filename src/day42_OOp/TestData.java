package day42_OOp;

public class TestData {
/*
data/attributes
*/
//burda instance veriables
	
	public String Name="saadet";
	private String name1="celil";//the only visible in the class class icinde okunur 	
private int ID=200;
	public String getname1() {//read the private data only encapsul icine aliyoruz diger classlarda okunsun diye
		return name1;           //okursun degistiremezsin
	}                          //getin icine parameter veremeyiz
                               //acces modifr needs to be public
public int getID() {
	return ID;
}
//setter(Modify);
//if you dont want to read you want to change the volue of 
public void setName(String Name) {
	//birsey return etmeyecek o yuzden void sadece volue degistrck
 this.Name=Name;//this used for call instance veriable in an object instance

}
public void setID(int ID) {
	this.ID=ID;

}



}
