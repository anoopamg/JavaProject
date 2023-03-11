package test;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Anoopa";
		String lname = "M G";
		String location = "She is from England";
		
		System.out.println("String length :"+name.length());
		System.out.println("String length :"+lname.length());
		System.out.println("String length :"+location.length());
		
		System.out.println("4th char in location = "+location.charAt(0));
		System.out.println("4th char in location = "+location.charAt(4));
		System.out.println("Last char in location = "+location.charAt(location.length()-1));
		System.out.println("To uppercase :"+location.toUpperCase());
	}

}
