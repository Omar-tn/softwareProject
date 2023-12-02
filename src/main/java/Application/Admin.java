package Application;

import java.util.Scanner;

public class Admin {
	private String username;
	private String Email;
	private int password;
	
	
	public Admin() {
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
	
	public void AdminOperation() {
		Scanner AOperation = new Scanner(System.in);
		
		while(true){

			System.out.println("\n+------- Welcome to Admin Wizard -------+\n");
	    	System.out.println("1) Manage Products");
	    	System.out.println("2) Manage Categories");
	    	System.out.println("3) Manage Customers");
	    	System.out.println("4) Manage Installation");
	    	System.out.println("5) Exit");
	    	System.out.println("Enter The Operation Number: ");
	    	// for the admin dashboard
	    	int OP = AOperation.nextInt();

        	switch(OP) {
    		case 1:
    			System.out.println("\\n+------- Manage Product -------+\\n");
    			//---------------------------------------
    			System.out.println("1) Add Products");
    			System.out.println("2) Update Products");
    			Scanner ManageIn = new Scanner(System.in);
    			Scanner Operation = new Scanner(System.in);
    			int Min = ManageIn.nextInt();
    			if(Min == 1) {
    				System.out.print("Product Name: ");
    				String PName = Operation.nextLine();
    				System.out.print("\nProduct Descreption: ");
    				String PDescreption = Operation.nextLine();
    				System.out.print("\nProduct Quantity: ");
    				int PQuantity = Operation.nextInt();
    				System.out.print("\nProduct Price: ");
    				int PPrice = Operation.nextInt();
    				System.out.print("\nProduct Category: ");
    				String PCategory = Operation.nextLine();
    				Product NewProduct = new Product(PName,PDescreption,PQuantity,PPrice,PCategory);
    				System.out.println("\nAdded Successfuly");
    			}else if(Min == 2){
    				// update Poduct
    			}else {
    				System.out.println("Invalid Input");
    			}
    			break;
    		case 2:
    			System.out.println("Manage Categories:");
    			break;
    		case 3:
    			System.out.println("Manage Customers:");
    			break;
    		case 4:
    			System.out.println("Manage Installation:");
    		case 5:
    			System.exit(0);
    		}
		}
		
	}
}