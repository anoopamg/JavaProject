package test;

public class LoopExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  int num = 1; System.out.print("Print numbers from 1 to 10:"); 
		  while(num < 11)
		  { 
			  if(num !=5)
				  System.out.println(num +","); 
			  num++;
		  }
		  System.out.println("End of while loop");
		 
		
		int num1 = 10;
		System.out.print("Print numbers from 10 to 1:");
		while(num1 >0)
		{
			if(num1 ==5)
			{
				System.out.println("Skip");
				num1--;
				continue;
			}
				System.out.println(num1);
			num1--;
		}
		System.out.println("End of while loop");
		
		int num2 = 1;
		System.out.print("Print numbers from 10 to 1:");
		while(num2 >0)
		{
			if(num2 ==5)
			{
				System.out.println("Stop");
				num2++;
				break;
			}
				System.out.println(num2);
			num2++;
		}
		System.out.println("End of while loop");
	}

}
