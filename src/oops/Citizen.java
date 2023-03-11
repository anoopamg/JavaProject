package oops;

public class Citizen extends Person {  
	/*extends Person class and gets access to all its properties. 
	 * Person is the parent class
	 */
	public int SSN;
	
	public Citizen() {
		System.out.println("Inside default constructor");
	}
	
	public Citizen(String Name, int Age, int SSN, String CountryName) {
		this.Name = Name;
		this.Age = Age;
		this.CountryName = CountryName;
		this.SSN = SSN;
		System.out.println("Inside parameterized constructor");
		System.out.println("Data passed from runner class : "+this.Name+","+this.Age+","+this.CountryName+","+this.SSN);
	}
	
	public void Print() {
		System.out.println("Print SSN :"+SSN);
	}

}
