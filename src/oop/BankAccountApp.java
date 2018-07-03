package oop;

public class BankAccountApp {
	
	public static void main(String[] args) {
		// Creating a new bank account >> think instantiate an object
		
		BankAccount acc1 = new BankAccount();
		//acc1.name = "Josu";
		// Defining name using Encapsulation
		
		acc1.setName("Josue");
		System.out.println("Name: " + acc1.getName());
		acc1.setSsn("1234567890");
		System.out.println(acc1.getSsn());
		
		
		acc1.accountNumber = "01234145";		
		acc1.balance = 10000;
		acc1.setRate();
		acc1.increaseRate();
		
		acc1.deposit(1500);

		
		//Polymorphism through overriding
		System.out.println(acc1.toString());
		
		
		//Polymorphism through overloading
		BankAccount acc2 = new BankAccount("Checking account");
		acc2.accountNumber = "01234145";
		
		BankAccount acc3 = new BankAccount("Savings account", 5000);
		acc3.accountNumber = "01234145";
		
		/*
		acc3.getBalance();
		
		
		// Demo for inheritance
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.name = "Juan";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.coumpound();
	*/
	
	}
	
	
	

}