package Collections;

import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {
	
	public static void main(String[] args) {
		
		HashSet<String> set1 = new HashSet<String>();
		set1.add("Mark");
		set1.add("Tom");
		set1.add("Alan");
		set1.add("Steve");
		set1.add("Zora");
		set1.add("Ian");
		System.out.println("Elements in Set ");
		System.out.println(set1);
		
		//add duplicate element Mark
		set1.add("Mark");
		System.out.println(set1); // will not include duplicate
		
		set1.add(null);
		System.out.println(set1); // will allow null value
		
		//TreeSet or in other words Sorted set 
		TreeSet<String> tset = new TreeSet<String>();
		tset.add("Steve");
		tset.add("Zora");
		tset.add("Alan");
		tset.add("Mark");
		tset.add("Mark");
		System.out.println("Elements in TreeSet ");
		System.out.println(tset);
	}

}
