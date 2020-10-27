package bankApp;


public class Bank {
	
	public int balance;
	public Bank(int balance) {
		this.balance=balance;
	}
	
	 public void checkBalance() {
		 System.out.println(balance);
	 }
	
	
	public void getBalanceWhenDeposit(int depositAmount) {
		balance=balance+depositAmount;
		
		
	}
	public void getBalanceWhenWithdraw(int withdrawAmount) {
		balance=balance-withdrawAmount;
	}
	
	
	
	

}
