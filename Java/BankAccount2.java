class BankAccount2 implements Bank{
	String accountHolderName;
	String bankName;
	double accountBalance;
	
	BankAccount2(String accountHolderName, String bankName, double initialBalance){
		this.accountHolderName = accountHolderName;
		this.bankName = bankName;
		this.accountBalance = initialBalance;
	}
	
	public void getBalance(){
		System.out.println("Bank Account: " + bankName + ", \nAccount Holder name: " + accountHolderName + ", \nAccount Balance: " + accountBalance + "\n");
	}
	
	public double deposit(double amt){
		return this.accountBalance += amt;
	}

	
	public double withdraw(double amt){
		return this.accountBalance -= amt;
	}
	
	public static void main(String[] args){
		BankAccount2 bankAcc1 = new BankAccount2("John", "ICICI", 50000.0);
		BankAccount2 bankAcc2 = new BankAccount2("Christina", "HDFC", 15000.0);
		BankAccount2 bankAcc3 = new BankAccount2("Mary", "SBI", 55000.0);
		
		bankAcc1.deposit(1000.0);
		bankAcc1.withdraw(20000.0);
		bankAcc1.getBalance();
		
		bankAcc2.deposit(700.0);
		bankAcc2.withdraw(7000.0);
		bankAcc2.getBalance();
		
		bankAcc3.deposit(500.0);
		bankAcc3.withdraw(15000.0);
		bankAcc3.getBalance();
	}
}