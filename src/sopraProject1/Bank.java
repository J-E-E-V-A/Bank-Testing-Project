package sopraProject1;

public class Bank {
private int bankid;
private String bankname;
private String accnumber;
public int getBankid() {
	return bankid;
}
public void setBankid(int bankid) {
	this.bankid = bankid;
}
public String getBankname() {
	return bankname;
}
public void setBankname(String bankname) {
	this.bankname = bankname;
}
public String getAccnumber() {
	return accnumber;
}
public void setAccnumber(String accnumber) {
	this.accnumber = accnumber;
}
public Bank(int bankid, String bankname, String accnumber) {
	super();
	this.bankid = bankid;
	this.bankname = bankname;
	this.accnumber = accnumber;
}
public Bank() {
	super();
}
@Override
public String toString() {
	return "Bank [bankid=" + bankid + ", bankname=" + bankname + ", accnumber=" + accnumber + "]";
}

}
