package labs;


public class Student{
		
		private String name;
		private String lastName;
		private String email;
		private static int iD = 1000;
		private String studentId;
		private String SSN;
		private double balance;
		private String phone;
		private String city;
		private String state;
		
		// Constructor
		Student(String name, String lName, String SSN){
			
			if(name != "" && lName != "" && SSN.length() == 9) {
			this.name = name;	// Assigning student name
			this.lastName = lName;	// Assigning student last name
			this.SSN = SSN;
			this.balance = 0;
			
			int random = (int) (Math.random() * 10000);		// generating a random number from 1000 to 9000 for the student ID
			iD++;
			this.studentId = iD + "" + random + "" + SSN.substring(5, 9);
			createEmail(name, lName);
			}
			else System.out.println("The information entered is incorrect.");
		}
		
		private void createEmail(String name, String lName) {
			this.email = name.toLowerCase() + lName.toLowerCase() + "@ja.com";
		}
		// Function for payment to subtract from the current balance
		public void pay(double balance) {
			
			if(this.balance-balance > 0) {
			this.balance-=balance;
			System.out.println("Payment done for: " + balance + "\nYour current balance is: " + this.balance);
			
			}
			else System.out.println("Not enough funds to pay school");
		}
		
		// Function to output the current balance of the student
		public double checkBalance() {
			return balance;
		}
		
		//Add amount to balance
		public void addBalance(double balance) {
			this.balance+= balance;
		}
		
		//Encapsulation for phone assignment
		public void setPhone(String phone) {
			this.phone = phone;
		}
		
		//Encapsulation for city
		public void setCity(String city) {
			this.city = city;
		}
		
		//Encapsulation for state
		public void setState(String state) {
			this.state = state;
		}
		
		//enroll verification
		public boolean enroll() {
			if(balance > 999)
			return true;
			else
				return false;
		}
		
		public static void getCourses() {
			String[] courses = {"Comp101", "History", "Algebra", "English"};
			System.out.println("Student is currently enrolled to the following courses:");
			for(int c = 0; c < 4; c++) {
				System.out.println("Courses: " + courses[c]);
			}
		}
		
		@Override
		public String toString() {
			return "[Name : " + name + " ]\n[Last Name: " + lastName + "]\n[Student ID: " + studentId + " ]\n[Email: " + email + " ]\n[Phone Number: " + phone + " ]\n[City: " + city + " ]\n[State: " + state + " ]\n\n[Balance: " + balance + " ]";
		}
}
