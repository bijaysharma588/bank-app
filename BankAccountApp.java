package test;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("40102563", 1000);
		//BankAccount acc2 = new BankAccount("42506398", 2000);
		//BankAccount acc3 = new BankAccount("98567301", 3000);
		
		
		//acc1.showBalance();
		System.out.println(acc1.toString());
		acc1.setName("Bijay");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(800);
		acc1.billPay(700);
		acc1.accinterest();
		
	}

}

class BankAccount implements Iinterest{
	
	// properties
	private static int iD = 1000;   // internal Id
	private String accountNumber;   // iD + random 2-digit number + first 2 of SSN
	private static final String routingNumber = "100502";
	private String name;
	private String SSN;
	private double balance;
	
	//constructor
	public BankAccount(String SSN, double initDeposit) {
		balance = initDeposit;
		
		
		System.out.println("New Account Created.");
		this.SSN = SSN;
		iD++;
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		// random number generator
		int random = (int) (Math.random() * 100);
		accountNumber = iD + "" +   random + SSN.substring(0, 2);
		System.out.println("Your account Number: " + accountNumber);
		
	}
	public void setName(String name) {
		this.name = name;
		
	}
	 public String getName() {
		 return name;
	 }
	 
	 public void makeDeposit(double amount) {
		 balance = balance + amount;
		 System.out.println("Deposit amount: " + amount);
		 showBalance();
	 }
	public void billPay(double amount) {
		balance = balance - amount;
		System.out.println("paying bill: " + amount);
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance: " + balance);
		
	}
	
	public void accinterest() {
		
		balance = balance * (1 + (rate/100));
		System.out.println("after interest: " + balance);
	}
	public String toString() {
		return "[Name: " + name + "]\n[AccountNumber: " + accountNumber  +"]\n"+"[Routing Number: " + routingNumber + "]\n" + "[Balance: " + balance + "]";
		
	}
	
	
}