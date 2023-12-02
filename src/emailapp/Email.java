package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity =500;
	private int defaultPasswordLength =10;
	private String alternateEmail;
	private String companySuffix = "aeycompany.com";


// constructor to receive the first name and last name
	public Email(String firstName, String lastNmae) {
		this.firstName = firstName;
		this.lastName = lastNmae;
		
		// call a method asking for the department - return the department
		this.department = setDepartment();
		
		// call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is" + this.password);
		// combine elements to generate email
		email = firstName.toLowerCase()+ "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
	}
// Ask for the department
	private String setDepartment(){
		System.out.print("New worker: "+ firstName +".Department codes:\n1 for Sales\n2 for Development\n3 for Accoounting\n0 for none\n Enter department code:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) {return "sales";}
		else if(depChoice == 2) {return "dev";}
		else if(depChoice == 3) {return "acct";}
		else {return " ";}

		
	}
// Generate a random password
	private String randomPassword(int lenght) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[defaultPasswordLength];
		for (int i=0; i < defaultPasswordLength; i++) {
			int rand = (int) Math.random() *  passwordSet.length();
			password[i] = passwordSet.charAt(rand);
			
			
		}
		
		return new String(password);
	}
// Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
		
	}
	
// Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
		
		
	}
//Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	public int getMailboxCapacity() {return mailboxCapacity; }
	public String getAlternateEmail() {return alternateEmail; }
	public String getPasssword( ) {return password; }
	
	public String showInfo() {
		return "DISPLAY NAME" + firstName + " " + lastName +
				"\nCOMPANY EMAIL" + email +
				"\nMAILBOX CAPACITY" + mailboxCapacity + "mb";
	}
		
}

