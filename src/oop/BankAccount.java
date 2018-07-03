package oop;

public class BankAccount implements IRate {

	// Define Variables
	String accountNumber;
	
	// static >> belongs to the CLASS not the object instance
	// final >> constant
	private static final String routingNumber = "0987";
	
	// Instance Variables
	private String name;
	private String ssn;
	String accountType;
	double balance = 0;
	
	
	// Constructor definitions: these are unique methods
		// 1. The are used to define / setup / initialize properties of an object
		// 2. Constructors are IMPLICITLY called upon INSTANTIATION
		// 3. The same name as the class itself
		// 4. Constructors have NO return type
	
	BankAccount(){
		System.out.println("NEW ACCOUNT CREATED.");
	}
	// Overloading: same method name with different arguments
	

	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit){
		// initDeposit, accoutType, Msg are all local variables
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT: $" + initDeposit);
		String Msg = null;
		
		if(initDeposit < 1000) {
			Msg = "ERROR: The minimum deposit must be at least $1000.00";
		}
		else {
			Msg = "Thanks for your initial deposit of $" + initDeposit;
		}
		
		System.out.println(Msg);
		balance = balance + initDeposit;
	}
	 
	
	// Getters / Setters
	
	// Allow the user to define the Name
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return "Mr. " + name;
	}	
	
	
	public String getSsn() {
		return ssn;
	}


	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	// Interface Methods
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	public void increaseRate() {
		System.out.println("INCREASE RATE");
	}


	// Define methods
	void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("WITHDRAW");
	}
	
	// private: can only be called from within the class
	private void showActivity(String activity) {
		System.out.println("YOUR RECENT TRANSACTION: " + activity + "");
		System.out.println("YOUR NEW BALANCE IS: $" + balance);
		
	}
	
	void getBalance() {
		System.out.println("Balance: " + balance);
	}
	
	void getStatus() {
		
	}
	
	
	@Override
	public String toString() {
		return "[ " + name + ". " + accountNumber + ". BALANCE: $" + balance + " ]";
	}
	
	
}
