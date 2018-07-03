package basics;

public class AssignmentOne {

	public static void main(String[] args) {
		// Assignment for adding number value and previous numbers before until reaching 1
		
		// prints the sum of the value number and the numbers between it until it reaches 0
		System.out.println("The summatory of all numbers including 5 and less is " + sumAll(5));
		
		// function call to multiply the value number and the numbers between it until it reaches 1
		System.out.println("The factorial value of 5 is " + fac(5));
		
		
		// array function call to select the minimum, maximum and average
		int cel[] = {10,34,93,2,54};
		
		// Print out of the maximum, minimum and average of the numbers in array cel[]
		//System.out.println("The maximum number in the array is " + maxNumArray(cel));
		//System.out.println("The minimum number in the array is " + minNumArray(cel));
		//System.out.println("The average of all the numbers in the array is " + avgNumArray(cel));
		maxNumArray(cel);
		minNumArray(cel);
		avgNumArray(cel);
		
	}

	// method will return the sum of the number on the parameter and all the numbers that come before it until it reaches 1
	public static int sumAll(int n) {
		if(n == 0) {
			return 0;
		}
		else if(n == 1) {
			return 1;
		}
		return n + sumAll(n - 1);
	}
	
	// method computes the factorial of the value passed through the parameter
	public static int fac(int n) {
		if(n == 0)
			return 0;
		else if(n == 1)
			return 1;
		return n * fac(n - 1);
	}
	
	// method will return the highest number in the array
	public static void maxNumArray(int n[]) {		
		int max = n[0];
		for(int count = 0; count < n.length; count++) {
			if(max < n[count])
				max = n[count];
		}
		System.out.println("The highest number in the array is " + max);
	}
	
	// method will return the minimum number on the array
	public static void minNumArray(int n[]) {
		int min = n[0];
		for(int count = 0; count < n.length; count++) {
			if(min > n[count])
				min = n[count];
		}
		
		System.out.println("The lowest number in the array is " + min);
	}

	// method will return the average of the array
	public static void avgNumArray(int n[]) {
		int avg = 0;
		int sum = 0;
		
		for(int count = 0; count < n.length; count++) {
			sum+= n[count];
		}
		avg = sum / n.length;
		
		System.out.println("The average of the numbers in the array is " + avg);
	}
	
}
