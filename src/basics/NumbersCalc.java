package basics;

public class NumbersCalc {
	
	public static void main(String[]args) {
			
		int numA = 10;		// numA will be added in addNumbers function
		int numB = 20;		// numB will be added in addNumbers function
		
		System.out.println("Program is starting");
		printName();
		addNumbers(numA, numB);
		int product = multiplyNumbers(numA, numB);
		//System.out.println("The product of numbers " + numA + " and " + multiplyNumbers(numA, numB));
		System.out.println("The product of numbers " + numA + " and " + product);
	}
	
	static void printName() {
		//This funcion only prints the name
		System.out.println("My name is Josue");
	}
	
	static void addNumbers(int numberA, int numberB) {
		//This function will add 2 numbers
		int sum = numberA + numberB;
		System.out.println("The sum of numbers " + numberA + " and " + numberB + " is " + sum);
	}
	
	static int multiplyNumbers(int valueA, int valueB) {
		int product = valueA * valueB;
		return product;
	}
		
}