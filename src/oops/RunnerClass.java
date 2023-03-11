package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Employee emp1 = new Employee();
		emp1.Name = "Shreyas";
		emp1.EmpId = 1001;		
		emp1.DisplayName();
		emp1.DisplayId();

		Employee emp2 = new Employee();
		emp2.Name = "Angel";
		emp2.EmpId = 1002;		
		emp2.DisplayName();
		emp2.DisplayId();
		

		Employee emp3 = new Employee("Nila",1003);
		emp3.DisplayName();
		emp3.DisplayId();
		
		Employee.DisplaySalary();
		
		Citizen ct1 = new Citizen();
		ct1.Age = 50;
		ct1.Name ="Mike";
		ct1.SSN = 12345;
		//ct1.Country  => since Country is private it cannot be accessed using the object of the child class .
		ct1.CountryName = "India"; //=> since CountryName is protected, it can be accessed using the object of the child class.
		
		Citizen ct2 = new Citizen("Norman",42,765381,"USA");
		ct2.Print(); // this calls Print within citizen class
		
		Insurance ins = new Insurance();
		ins.Name = "Sara";
		ins.InsuranceId = 923244;
		ins.Print(); // this calls Print within insurance class
		
		//Constructor call flow
		System.out.println("**** Constructor call flow *****");
		System.out.println("**** Creating ct3");
		Citizen ct3 = new Citizen();
		ct3.Age = 50;
		ct3.Name = "Mike";
		ct3.SSN = 12345;
		ct3.CountryName = "India";
		ct3.Print();
		
		System.out.println("**** Creating ct4");
		Citizen ct4 = new Citizen("Rahul",30,6789,"India");
		ct4.Print();
		
		System.out.println("**** Creating ins1");
		Insurance ins1 = new Insurance();
		ins1.InsuranceId = 3000;
		ins1.Print();		
	*/
		
		EncapsulationExample encap = new EncapsulationExample();
		encap.setEmpId(2001);
		System.out.println("Emp Id is : "+encap.getEmpId());
		
		encap.setCompany("HCL");
		System.out.println("Company Name : "+encap.getCompany());
		
		encap.setSalary(500000);
		System.out.println("Salary is : "+encap.getSalary());
	}

}
