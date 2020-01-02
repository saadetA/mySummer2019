package day43java_recap;

public class Credentials {

public String UserName;
public String password;

private String kullanici="ibrahim";
private String sifre="ankara";
//kullanici
public void setkullanici(String kullanici) {
this.kullanici=kullanici;	
}
public String getkullanici() {
	return kullanici;
}
//sifre
public void setsifre(String sifre) {
	this.sifre=sifre;
}
public String getsifre() {
	return sifre;
}

private int ID=12345;
private long ssn=1223344;
//id
public void setID(int ID) {
	this.ID=ID;
}
public int getID() {
	return ID;
}
//ssn
public void setssn(long ssn) {
	this.ssn=ssn;
}
public long getssn() {
	return ssn;
}

}
