package basics;

import java.util.*;

public class CollectionSample {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(); // Non-generic arraylist
		al.add(2);
		al.add("Neenu");
		al.add(87);
		al.add(7.2f);
		System.out.println(al);
		
		ArrayList<String> a2 = new ArrayList(); // Generic arraylist
		a2.add("Neenu");
		a2.add("Java");
		a2.add("collection");
		System.out.println(a2);
		
		al.remove(2);
		System.out.println(al);
		
		ArrayList<String> a3 = new ArrayList();
		a3.add("Obsqura");
		a3.add("Fruits");
		a3.add("Vegetables");
		System.out.println(a3);
		
		a3.addAll(a2);
		System.out.println(a3);
		
		a3.removeAll(a3);
		System.out.println(a3);
		
		System.out.println(al.get(1));// to get an element from particular index
		System.out.println(al.size()); // to get size of the arraylist
		
		boolean exi = al.contains("Neenu");  // check whether an element exists in an arraylist
		System.out.println(exi);
		boolean exi1 = al.contains(90);
		System.out.println(exi1);
		
		Iterator ob = al.iterator();
		while(ob.hasNext())
		{
			System.out.println(ob.next());
		}
		
		ob.remove();
		System.out.println(al);
		

	}

}
