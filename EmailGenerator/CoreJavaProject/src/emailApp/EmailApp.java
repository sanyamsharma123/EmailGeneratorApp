package emailApp;

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("Sanyam", "Sharma");
		em1.setAlternateMail("sharma@gmail.com");
		
		System.out.println("Your alternate email is : " +em1.getAlternateEmail());
        
		System.out.println(em1.showInfo());
	}

}
