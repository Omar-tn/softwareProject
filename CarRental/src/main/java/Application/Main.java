package Application;
import java.util.Scanner;

public class Main {
	static Admin admin = new Admin();
	static Customer customer = new Customer();
	static Installer installer = new Installer();
	
	public static void Registration() {
		int invalid = -2;
		do {
			Scanner input = new Scanner(System.in);
			Scanner fla = new Scanner(System.in);
			System.out.println("\n+------- Registration Form -------+\n");
			//---------------------------------------------
			System.out.print("Do you Register as Admin/customer?(admin => 1 , customer =>2 , installer => 3)");
			int flag = fla.nextInt();
			if(flag == 1) {
				invalid = 1;
				System.out.println("\n+------- Admin Register Form -------+\n");
				System.out.print("Enter Your Username: ");
				String username = input.nextLine();
				admin.setUsername(username);
				// ---------------------------------------------
				System.out.print("Enter Your Email: ");
				String email = input.nextLine();
				admin.setEmail(email);
				// ---------------------------------------------
				System.out.print("Enter Your password: ");
				int pass = input.nextInt();
				admin.setPassword(pass);
				
			} else if(flag == 2) {
				invalid = 1;
				System.out.print("\n+------- Customer Register Form -------+\n");
				System.out.print("Enter Your Username: ");
				String username = input.nextLine();
				customer.setUsername(username);
				// ---------------------------------------------
				System.out.print("Enter Your Email: ");
				String email = input.nextLine();
				customer.setEmail(email);
				// ---------------------------------------------
				System.out.print("Enter Your password: ");
				int pass = input.nextInt();
				customer.setPassword(pass);
				
			}else if(flag == 3) {
				invalid = 1;
				System.out.print("\n+------- Installer Register Form -------+\n");
				System.out.print("Enter Your Username: ");
				String username = input.nextLine();
				installer.setUsername(username);
				// ---------------------------------------------
				System.out.print("Enter Your Email: ");
				String email = input.nextLine();
				installer.setEmail(email);
				// ---------------------------------------------
				System.out.print("Enter Your password: ");
				int pass = input.nextInt();
				installer.setPassword(pass);
			}else {
				invalid = -1;
				System.out.println("Invalid input, please enter number between 1 - 3 only");
			}
		}while(invalid == -1);
		
	}
	
	public static void Login() {
		int invalid = -2;
		do {
			Scanner input1 = new Scanner(System.in);
			System.out.println("\n+------- Login Form -------+\n");
			//---------------------------------------------
			System.out.print("Enter your username: ");
	        String UserN = input1.nextLine();
	        System.out.print("Enter your password: ");
	        int password = input1.nextInt();
	        
	        if(customer.equal(UserN, password) == 1) {
	        	invalid = 1;
	        	customer.CustomerOperation();
	        }
	        else if(admin.equal(UserN, password) == 1){
	        	invalid = 1;
	        	admin.AdminOperation();
	        }
	        else if(installer.equal(UserN, password) == 1) {
	        	invalid = 1;
	        	installer.InstallerOperation();
	        }
	        else {
	        	invalid = -1;
	        	System.out.print("invalid input.");
	        }
		}while(invalid == -1);
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("+---------------------------------------------+");
		System.out.println("+----------- Welcome To Car Rentel -----------+");
		System.out.println("+---------------------------------------------+");
		
		Registration();	
		Login();
	

	}

}