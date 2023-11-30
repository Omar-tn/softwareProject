package Application;

import java.util.Scanner;

public class Customer {
	private String username;
	private String Email;
	private int password;
	
	
	
	public Customer() {
		super();
		username = "";
		Email = "";
		password = 0;
	}
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	
	public int equal(String username, int pass) {
		if(this.username.equalsIgnoreCase(username) & this.password == pass) {
			return 1;
		}else {
			return -1;
		}
	}
	
	
	public void CustomerOperation() {
		Scanner COperation = new Scanner(System.in);
    	
    	while(true) {
    		System.out.println("\n+------- Welcome to Customer Wizard -------+\n");
        	System.out.println("1) Browse Products");
        	System.out.println("2) Make Purchases");
        	System.out.println("3) View Orders History");
        	System.out.println("4) View Installation Requests");
        	System.out.println("5) Edit profile");
        	System.out.println("6) Exit");
        	System.out.println("Enter The Operation Number: ");
        	// for the customer dashboard
        	int OP = COperation.nextInt();
        	
    		switch(OP) {
    		case 1:
    			System.out.println("Browse Products:");
    			break;
    		case 2:
    			System.out.println("Make Purchase:");
    			break;
    		case 3:
    			System.out.println("View Order History:");
    			break;
    		case 4:
    			System.out.println("View Installation Requests:");
    			break;
    		case 5:
    			System.out.println("Your profile:");
    			break;
    		case 6:
    			System.out.println("Thank you for using our application.");
    			System.exit(0);
    		}
    	}
	}
	

}