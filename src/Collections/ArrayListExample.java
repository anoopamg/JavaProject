package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {
	
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("Mike");
		list1.add("Smith");
		list1.add("Mark");
		list1.add("Cate");
		list1.add("Jimmy");
		
		System.out.println("Elements in arraylist are : "+list1);
		
		System.out.println("Size of ArrayList : "+list1.size());
		
		System.out.println("Add new items to ArrayList");
		list1.add(2, "Kelly");
		System.out.println("Latest elements in arraylist are : "+list1);
		
		System.out.println("Update items in ArrayList");
		list1.set(1, "Tim");
		System.out.println("Updated elements in arraylist are : "+list1);
		
		System.out.println("Remove items from ArrayList");
		list1.remove((list1.size()-1));
		System.out.println("Latest elements in arraylist are : "+list1);
		
		//Iterate through the list
		System.out.println("Iteration through list using for loop");
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
		
		System.out.println("Iteration through list using forEach loop");
		for(String value:list1) {
			System.out.println(value);
		}
		
		System.out.println("Iteration through list using Iterator class");
		Iterator<String> itr = list1.iterator();		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//sort the array list
		System.out.println("Sort using collections.sort()");
		Collections.sort(list1);
		System.out.println("Sorted list : "+list1);
		
		//Iterate through the list
		System.out.println("Reverse sorting ");
		Collections.sort(list1,Collections.reverseOrder());
		System.out.println("Reverse Sorted list : "+list1);
				
	}
	

}
