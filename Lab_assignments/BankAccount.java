//lab_anp-c6597_05-12-23
//OOPS Concept -- Assignment-1

//main class
class BankAccount implements Bank{
	String accoundHolderName; //instance variable
	String bankName;
	double accountBalance;
	
	//constructor method
	BankAccount(String name,String bank, double initialBalance){
		accoundHolderName = name;
		bankName = bank;
		accountBalance = initialBalance;
	}
	
	//getBalance method implemented from Bank interface
	//displays the account balance
	public void getBalance(){
		System.out.println("Bank Name: " + bankName + "\nAccount Holder Name: " + accoundHolderName + "\nAccount Balance: " + accountBalance + "\n");
	} 
	
	//deposit method implemented from Bank interface
	//adds amount to account balance
	public void deposit(double amt){
		accountBalance += amt;
		System.out.println("Amount Deposited: " + amt);
	}
	
	//withdraw method implemented from Bank interface
	//subtracts amount from account balance 
	public void withdraw(double amt){
		if(accountBalance > amt){
			accountBalance -= amt;
			System.out.println("Withdraw Amount: " + amt);
		}
		else{
			System.out.println("Account Balance is Low!");
		}
		
	}
	
	//main method
	public static void main(String[] args){
		//object creation
		BankAccount bankAcc1 = new BankAccount("John", "ICICI", 15000.0);
		BankAccount bankAcc2 = new BankAccount("Mary", "HDFC", 25000.0);
		BankAccount bankAcc3 = new BankAccount("Alexandar", "SBI", 20000.0);
		
		//depositing, withdrawing and displaying the balance for object1
		bankAcc1.deposit(500);
		bankAcc1.withdraw(1000);
		bankAcc1.getBalance();
		
		//depositing, withdrawing and displaying the balance for object2
		bankAcc2.deposit(1000);
		bankAcc2.withdraw(10000);
		bankAcc2.getBalance();
		
		//depositing, withdrawing and displaying the balance for object3
		bankAcc3.deposit(700);
		bankAcc3.withdraw(500);
		bankAcc3.getBalance();
		
	}
	
}