package Application;
import parts.Catalog;
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
	
	public Customer(String username) {
		super();
		this.username = username;
	}
	public Customer(String username, String email, int password) {
		super();
		this.username = username;
		Email = email;
		this.password = password;
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
        	Catalog NewCatalog = new Catalog();
    		switch(OP) {
    		case 1:
    			System.out.println("\n+------- Browse Products -------+\n");
    			NewCatalog.viewAllProducts();
    			break;
    		case 2:
    			System.out.println("\n+------- Make Purchases -------+\n");
    			Scanner Purchase = new Scanner(System.in);
    			NewCatalog.requestInstallation(Purchase);
    			System.out.println("Successfully");
    			break;
    		case 3:
    			System.out.println("View Order History:");
    			break;
    		case 4:
    			System.out.println("View Installation Requests:");
    			break;
    		case 5:
    			System.out.println("\\n+------- Your Profile -------+\\n");
    			System.out.println("Your Username: " + this.getUsername());
    			System.out.println("Your Email: " + this.getEmail());
    			System.out.println("1) Edit Username");
    			System.out.println("2) Edit Email");
    			System.out.println("3) Change Password");
    			Scanner Choise = new Scanner(System.in);
    			Scanner Operation = new Scanner(System.in);
    			int ChoiseNum = Choise.nextInt();
    			if(ChoiseNum == 1) {
    				System.out.print("Enter New Username: ");
    				String NewUsername = Operation.nextLine();
    				this.setUsername(NewUsername);
    				System.out.print("Updated Successfuly");
    			}else if(ChoiseNum == 2) {
    				System.out.print("Enter New Email: ");
    				String NewEmail = Operation.nextLine();
    				this.setEmail(NewEmail);
    				System.out.print("Updated Successfuly");
    			}else if(ChoiseNum == 3) {
    				System.out.print("Enter New Password: ");
    				int NewPassword = Operation.nextInt();
    				this.setPassword(NewPassword);
    				System.out.print("Updated Successfuly");
    			}else {
    				System.out.println("Invalid Input");
    			}
    			break;
    		case 6:
    			System.out.println("Thank you for using our application.");
    			System.exit(0);
    		}
    	}
	}
	

}