package simple;

import java.util.*;

public class ListExample {

	public static void main(String[] args) {


		List<String> l = new ArrayList<String>();
		
		l.add("Mango");
		l.add("Orange");
		l.add("Apple");
		l.add("Pappaya");
		l.add("Watermelon");
		
		Collections.sort(l);
		for(String s:l) {
			System.out.println(s);
		}
		
		boolean e = l.isEmpty();
		System.out.println(e);
		l.clear();
		
		boolean e1 = l.isEmpty();
		System.out.println(e1);
		

	}

}
