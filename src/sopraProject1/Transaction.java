package sopraProject1;

public class Transaction {
private int Balance;

public Transaction(int balance) {
	super();
	this.Balance = balance;
}
public void withdraw(int amount) {
//	if(amount>0 && amount<=this.Balance) {
		this.Balance-=amount;
		System.out.println(this.Balance);
//	}
//	else {
//		System.out.println("no withdraw");
//	}
}
public void deposite(int amount) {
	//if(amount>=this.Balance) {
		this.Balance+=amount;
		System.out.println(this.Balance);
	}
	//else {
		//System.out.println("No Amount");
	//}
}

