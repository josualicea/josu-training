package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("12345678901", 1000);
		BankAccount acc2 = new BankAccount("29384198923", 2000);
		BankAccount acc3 = new BankAccount("18273981274", 2500);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.payBill(200);
		acc1.accrue();
		System.out.println(acc1.toString());
	}

}


class BankAccount implements IInterest{
	//Properties of bank account
	private static int iD = 1000;	// Internal ID
	private String accountNumber;	// ID + 2 digit number + First 2 of the social security number
	private static final String routingNumber = "004541904";
	private String name;
	private String SSN;
	private double balance;
	
	//Constructor
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		iD++;
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int) (Math.random() * 100);
		accountNumber = iD + "" + random + SSN.substring(0, 2);
		//System.out.println(random);
		//System.out.println(SSN.substring(0, 2));
		System.out.println("Your account number is: " + accountNumber);
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void payBill(double amount) {
		System.out.println("Paying bill: " + amount);
		balance = balance - amount;
		showBalance();
	}
	public void makeDeposit(double amount) {
		System.out.println("Making deposit: " + amount);
		balance = balance + amount;
		showBalance();
	}
	public void showBalance() {
		System.out.println("Your balance is: " + balance);
	}

	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + " ]\n[Account Number: " + accountNumber + " ]\n[Routing Number: " + routingNumber + " ]\n[Balance: " + balance + " ]";
	}
	
}