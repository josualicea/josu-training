package oop;

class Person{
	
	String name;
	String email;
	String phone;
	
	void walk(){
		System.out.println(name + " is walking.");
	}
	
	void eat(){
		System.out.println(email);
	}
	
	void sleep(){
		System.out.println(name + " is sleeping.");
	}
}

public class Demo {

	public static void main(String[] args) {
		// Instantiating an object
		
		// Define properties
		Person person1 = new Person();
		person1.name = "Josu";
		person1.email = "josue@gmail.com";
		person1.phone = "3213213213";
		
		// Defining properties for second person
		Person person2 = new Person();
		person2.name = "Odie";
		person2.email = "odie@gmail.com";
		person2.phone = "7871231234";
		
		
		// Abstraction
		person1.walk();
		person1.sleep();
		person1.eat();		
		
		person2.walk();
		
		/*
		// Attributes, variables, adjectives, descriptors
		String name = "Josue";
		String email = "josu@testemail.com";
		String phone = "7123123457";
		
		// Action, activity, behavior
		//System.out.println(name + " is walking.");
		walking(name);
		System.out.println(name + " is eating");
		
		// What if we wanted to do this for another person
		
		// Another Person
		String name2 = "Odie";
		String email2 = "odie@testemail.com";
		String phone2 = "7875485147";
		
		// Action, activity, behavior
		//System.out.println(name2 + " is walking.");
		walking(name2);
		System.out.println(name2 + " is eating");
		*/
	}
	
	/*
	// Enhance by adding functions to minimize code
	static void walking(String name) {
		System.out.println(name + " is walking.");
	}
	*/
}
