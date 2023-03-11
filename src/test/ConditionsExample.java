package test;

import java.util.Scanner;

public class ConditionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 17;
		if(age<17) {
			System.out.println("I am NOT eligible to vote");
		}
		else if(age == 17)
		{
			System.out.println("I will be eligible next year");
		}
		else {
			System.out.println("I am eligible to vote");
		}
		
		int getAge;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter age: ");
		getAge = scanner.nextInt();
		
		System.out.println("Get Age :"+getAge);
		scanner.close();
	}

}
