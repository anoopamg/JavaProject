package test;

public class ForLoopExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Print 1 to 10: ");
		for (int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		/*=====================================================================*/
		System.out.println("Print 10 to 1: ");
		for (int i=10;i>0;i--)
		{
			System.out.println(i);
		}
		
		/*=====================================================================*/
		System.out.println("Table of 2");
		for (int i=1;i<=10;i++)
		{
			System.out.println(i +" * "+ 2 +" = " +i*2);
		}
		
		/*=====================================================================*/
		System.out.println("Table of 5");
		for (int i=1;i<=10;i++)
		{
			System.out.println(i +" * "+ 5 +" = " +i*5);
		}
		
		/*=====================================================================*/
		System.out.println("Table of 9");
		for (int i=1;i<=10;i++)
		{
			System.out.println(i +" * "+ 9 +" = " +i*9);
		}
		
		int[] arr1 = {10,23,35,56,78,12,3,5,90,31,6,9};
		System.out.println("Elements in the array : ");
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
		
		//using for each (array indexing cannot be done using for loop. We cannot find index value using for each)
		System.out.println("For each loop");
		for (int val:arr1) {
			System.out.println(val);
		}
		
		String str = "Automation";
		System.out.println("Read character of a string :");
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}

	}

}
