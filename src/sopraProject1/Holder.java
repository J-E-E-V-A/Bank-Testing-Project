package sopraProject1;

public class Holder {
	Bank account;
	private Transaction a;
	public int balance;
	public Holder(int bankid, String bankname, String accnumber,int Balance) {
		this.account=new Bank( bankid,  bankname, accnumber);
		this.balance=Balance;
	}
	public Transaction starttransaction() {
		a=new Transaction(this.balance);
		return a;
		
		
	}
	
	
	

}
