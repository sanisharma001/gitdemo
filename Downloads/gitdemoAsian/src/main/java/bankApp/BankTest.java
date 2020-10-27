package bankApp;

public class BankTest {
	
	public static void main(String[] args) {
		Bank bank=new Bank(100);
		bank.checkBalance();
		bank.getBalanceWhenDeposit(500);
		bank.checkBalance();
		bank.getBalanceWhenWithdraw(200);
		bank.checkBalance();
	}
	
	
	
	
}
