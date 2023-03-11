package test;

public class ArraysInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {10,20,30,40,50,60};
		
		System.out.println("Length of the array :"+num.length);
		System.out.println("First value in the array :"+num[0]);
		System.out.println("Last value in the array :"+num[num.length-1]);
		
		String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		System.out.println("Value at the 3rd position is :"+months[2]);
		
		String str = "Automation Master Program From Simplilearn. Happy Learning !";
		String[] str1 = str.split(" ");
		System.out.println("No: of words in the str1 :"+str1.length);

	}

}
