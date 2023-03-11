package Collections;

import java.util.HashMap;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String str = "Clean World Green World";
		Scanner getstr = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = getstr.nextLine();
		getstr.close();
		
		String[] words = str.split(" ");
		System.out.println("No: of words in the str1 :"+words.length);
		for(int i=0;i<=words.length-1;i++) {
			System.out.print(words[i]+" ");
		}
		
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		for(String word:words) {	
			if(map.keySet().contains(word)) {
				map.put(word, map.get(word)+1);
			}
			else {	
				map.put(word, 1);
			}
		}	
		System.out.println("\n Result map : "+map);
	}

}
