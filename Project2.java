package test;

public class Project2 {

	public static void main(String[] args) {
		Student obj1 = new Student("Bijay","123789");
		obj1.enroll("Math");
		obj1.enroll("English");
		obj1.enroll("history");
		obj1.showCourse();
		obj1.checkBalance();
		obj1.pay(1000);
		obj1.checkBalance();
		obj1.toString();
	}

}


 class Student {
	 	private String name;
	 	private String SSN;
	 	private static int iD = 100;
	 	private String email;
	 	private String userId;
	 	private String courses = "";
	 	private static final int cost = 800;
	 	private static int balance =0;
	 	
	 	public Student (String name, String SSN) {
	 		this.name = name;
	 		this.SSN = SSN;
	 		
	 		iD++;
	 		setEmail();
	 		
	 	}
	 	private void setEmail() {
	 		String email = name.toLowerCase() + "." + iD + "@gmail.com";
	 		System.out.println("Email ID: " + email);
	 		
	 	}
	 	private void payId() {
	 		//this.SSN = SSN;
	 		int max = 9000;
	 		int min = 1000;
	 		
	 		int random = (int) (Math.random() * 1000)* (max-min);
	 		random = random + min;
	 		 userId = iD + "" + random + "" + "" + SSN.substring(2);
	 		System.out.println("Your userId: " + userId);
	 	}
	 	public void enroll(String course) {
	 		this.courses= this.courses + course;
	 		System.out.println("your courses: " + courses);
	 		balance = balance + cost;
	 		
	 	}
	 	public void pay(int amount) {
	 		balance = balance - amount;
	 		System.out.println("Payment = " + amount);
	 	}
	 	public void checkBalance() {
	 		System.out.println("Balance: " + balance);
	 	}
	 	public String toString() {
	 	return name;	
	 		
	 	}
	 	public void showCourse() {
	 	System.out.println(courses);	
	 	}
	
}
