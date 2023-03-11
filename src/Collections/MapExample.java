package Collections;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> basket = new HashMap<String,Integer>();
		basket.put("Phone",1);
		basket.put("Laptop",2);
		basket.put("Earbuds",3);
		basket.put("Pen",3);
		
		System.out.println("Items in map : "+basket);
		
		basket.put("Earbuds",7);
		basket.put("Book",null); // since value part is like list, it allows null
		basket.put(null,null); // since key part is like set, it allows null
		System.out.println("Updated Items in map : "+basket);
		
		for(String item:basket.keySet()) {
			System.out.println("Item name is : "+item);
			System.out.println("Quantity of the item : "+basket.get(item));
		}
		
		for(Integer value:basket.values()) {
			System.out.println("Quantity of the item : "+value);
		}
		
		basket.remove("Pen");
		System.out.println("Items in map after removing : "+basket);
		
		

	}

}
