package oops;

public class Employee {
	
	public String Name;
	public int EmpId;
	private static int Salary; //this belongs to the class
	
	public Employee() {
		System.out.println("This is the default constructor");
	}
	
	public Employee(String str, int i) {
		//'this' keyword means the Name, EmpId belongs to the class 
		this.Name = str;
		this.EmpId = i;
	}
		
	public void DisplayName() {
		System.out.println("Name of the employee :"+Name);
	}
	
	public void DisplayId() {
		System.out.println("Employee Id :"+EmpId);
	}	
	
	public static void DisplaySalary() {
		Salary = 100000;
		System.out.println("Salary of the employees :"+Salary);
	}

}
