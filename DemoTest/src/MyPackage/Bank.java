package MyPackage;

public class Bank {

	String name;
	
	Bank(String name){                   //Constructor
		this.name = name;
	}
	
	void Credited(Employee employee) {           // Association through object
		System.out.println(name +" giving salary to this "+ employee.Name);
	}
	
	public static void main(String[] args) {
		
		Employee emp = new Employee("Harish");
		Bank bank = new Bank("SBI");
		
		bank.Credited(emp);         //Association
	}
}
