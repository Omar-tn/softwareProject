package Application;

import java.util.ArrayList;
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
		
		while(true) {
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
    			System.out.print("Enter the number of your Action: ");
    			Scanner ManageP = new Scanner(System.in);
    			Scanner Operation = new Scanner(System.in);
    			ArrayList<Product> productList = new ArrayList<Product>();
    			int Min = ManageP.nextInt();
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
    				productList.add(new Product(PName, PDescreption, PQuantity, PPrice, PCategory));
    				System.out.println("\nAdded Successfuly");
    			}else if(Min == 2){
    				System.out.print("\nEnter the name of Product: ");
    				String name = Operation.nextLine();
    				for (Product element : productList) {
    					if(element.getName().equalsIgnoreCase(name)) {
    						element.setName(name);
    						System.out.println("Edit successfuly");
    					}
    				}
    			}else {
    				System.out.println("Invalid Input");
    			}
    			break;
    		case 2:
    			System.out.println("\\n+------- Manage Categories -------+\\n");
    			System.out.println("Add Categories");
    			System.out.println("Edit Categories");
    			System.out.println("Delete Categories");
    			System.out.println("Enter the number of your Action: ");
    			Scanner ManageCat = new Scanner(System.in);
    			Scanner CategoryOperation = new Scanner(System.in);
    			ArrayList<Category> categoryList = new ArrayList<Category>();
    			int MCat = ManageCat.nextInt();
    			if(MCat == 1) {
    				System.out.print("\nEnter the name of category: ");
    				String Catname = CategoryOperation.nextLine();
    				categoryList.add(new Category(Catname));
    				System.out.println("\\nAdded Successfuly");
    			}else if(MCat == 2) {
    				System.out.print("\nEnter the name of category: ");
    				String name = CategoryOperation.nextLine();
    				for (Category element : categoryList) {
    					if(element.getName().equalsIgnoreCase(name)) {
    						element.setName(name);
    						System.out.println("Edit successfuly");
    					}
    				}
    			}else if(MCat == 3){
    				System.out.print("\nEnter the name of category do you want to delete: ");
    				String DeleteName = CategoryOperation.nextLine();
    				Category categoryToRemove = new Category(DeleteName);
    				categoryList.remove(categoryToRemove);
    				System.out.println("Delete successfuly");
    			}else {
    				System.out.println("Invalid Input");
    			}
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