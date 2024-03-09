package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String alternateEmail;
	private String department;
	private String password;
	private int defaultPasswordLength =10;
	private int mailboxCapacity =500;
	private String email;
	private String companySuffix = "syscompany.com";
	
	//Constructor
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created : "+ this.firstName + " "+ this.lastName);
		
		this.department = setDepartment();
		
		
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is "+ this.password);
		
		//combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		
	}
	
	//Ask for dept
	public String setDepartment() {
		System.out.print("Select Your Department\n 1. Sales\n 2. Development\n 3. Account\n 0. None\nEnter Your Department Code : ");
		Scanner inp = new Scanner(System.in);
		int deptChoice = inp.nextInt();
		if(deptChoice == 1) {return "Sales";}
		else if(deptChoice == 2) {return "Development";}
		else if(deptChoice == 3) {return "Account";}
		else {return "None";}
		
	}
	
	//Generate random password
	private String randomPassword(int length) {
		String passwordSet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$";
		char[] password =new char[length];
		for(int i=0;i<length;i++) {
			int rand = (int)(Math.random()* passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//set mailbox Capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//set alternate email
	public void setAlternateMail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	//change the password
	public void changePassword(String newPassword) {
		this.password = newPassword;
	}
	
	//get mailbox capacity
	public int getMailboxCapacity () { return this.mailboxCapacity; }
	
	//get alternate email
	public String getAlternateEmail () { return this.alternateEmail; }
	
	//get new password
	public String getPassword () { return this.password; }
	
	public String showInfo() {
		return "DISPLAY NAME : "+ firstName + " " + lastName +
				"\nDEPARTMENT : " + department +
				"\nCOMPANY EMAIL : " + email;
	}
	

}
