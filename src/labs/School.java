package labs;

public class School {

	private static final String NULL = null;

	public static void main(String[] args) {
		
		Student std1 = new Student("Josue", "Alicea", "123448765");
		std1.addBalance(300);
		std1.setPhone("7878330987");
		std1.setCity("San Diego");
		std1.setState("California");
		
		
		System.out.println(std1.toString());
		
		std1.pay(400);
		std1.getCourses();
		
		if(std1.enroll() == true)
			System.out.println("Student has been successfully enrolled");
		else
			System.out.println("Student needs to pay the initial enroll fee of " + (1000 - std1.checkBalance()));
	
	}
	

}
