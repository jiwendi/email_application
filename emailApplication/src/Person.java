import java.util.Scanner;


public class Person {

	/**
	 * @param args
	 */
	private String firstName;
	private String lastName;
	private String company;
	private String mailBoxCapacity ="500 GB";
	private String department;
	private String password;
	private String alternateemail;
	
	
	

	public Person(String firstName, String lastName, String company){
		this.firstName = firstName;
		this.lastName = lastName;
		this.company = company;
		System.out.println("Your email address is:" +firstName +"."+lastName+"@"+company+".com");
		this.department = setDepartment();
		System.out.println("Department:"+ this.department);
	}



	public String geName() {
		return firstName + lastName;
	}



	public void changeFirstName(String firstName) {
		this.firstName = firstName;
	}



		public void changeLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getCompany() {
		return company;
	}
	
	public String getmailBoxCapacity() {
		return mailBoxCapacity;
	}
	
	private String setDepartment(){
		
		System.out.println("Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting\n Choose a department: ");
		Scanner input = new Scanner(System.in);
		int depChoice = input.nextInt();
		
		if(depChoice == 1)
		{
			return "Sales";
		}else if(depChoice == 2){
			return "Development";
		}else if(depChoice == 3){
			return "Accounting";
		
			
		}else return "";
	}
}
	


