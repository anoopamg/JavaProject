package test;

import java.util.Scanner;

public class ReversalExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String reversal

		// String str1 = "Good Morning";
		String resultStr = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String :");
		String getStr = scanner.next();
		scanner.close();
		for (int i = getStr.length() - 1; i >= 0; i--) {
			resultStr = resultStr + getStr.charAt(i);
		}
		System.out.println("String 2 :" + resultStr);
		if (getStr.equals(resultStr)) // if the string value is Malayalam, since M is upper case pgm will detect it as
										// NOT palindrome
		{
			System.out.println("String is a Palindrome");
		} else if (getStr.equalsIgnoreCase(resultStr)) // if the string value is Malayalam, here it ignores the case and
														// will detect it AS palindrome
		{
			System.out.println("String is a Palindrome");
		} else {
			System.out.println("String is NOT a Palindrome");
		}
		
		//======================================================================
		String str2 = "David meets Lilly and Arjun";
		String[] arr2 = str2.split(" ");
		for(int i=0;i<=arr2.length-1;i++)
			System.out.print(arr2[i]+" ");
		String res = "";
		for(int i=arr2.length-1;i>=0;i--)
		{
			res = res + arr2[i]+" ";
		}
		System.out.println("\nResult :"+res);
		
	}

}
