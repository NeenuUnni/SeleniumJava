package basics;

import java.util.*;

public class DemoCollection {
	
	public void demo() {
		List<String> list = new ArrayList<String>();
		ArrayList<Integer> arrList= new ArrayList<Integer>();
		ArrayList<Integer> arrList2 = new ArrayList<Integer>();
		
		list.add("Mango");
		list.add("Orange");
		list.add("Apple");
		list.add("Mango");
		list.add(3, "Banana");
		System.out.println("List is:" + list);
		list.add("Pineapple");
		System.out.println("List is:" + list);
		list.set(2, "Kiwi");
		System.out.println("List is:" + list);
		list.remove(2);
		list.remove("Mango");
		System.out.println("List is:" + list);
		System.out.println(list.size());
	//	list.clear();
		System.out.println(list.get(0));
		
		arrList.add(124);
		arrList.add(200);
		arrList.add(300);
		arrList.add(1211);
		System.out.println("ArrayList1 is:" + arrList);
		
		arrList2.add(100);
		arrList2.add(200);
		arrList2.add(300);
		arrList2.add(400);
		System.out.println("ArrayList2 is:" + arrList2);
		
		arrList2.addAll(arrList);
		System.out.println("ArrayList2 is:" + arrList2);
		
		arrList2.removeAll(arrList);
		System.out.println("ArrayList2 is:" + arrList2);
		System.out.println(arrList2.containsAll(arrList));
		System.out.println("ArrayList2 is:" + arrList2);
		arrList2.clear();
		System.out.println("ArrayList2 is:" + arrList2);
		arrList2.retainAll(arrList);
		System.out.println("ArrayList2 is:" + arrList2);
		
		Set<String> set = new HashSet<String>();
		set.add("Fruits");
		set.add("Vegs");
		set.add("Fruits");
		set.add("Groceries");
		System.out.println("Set is:" + set);
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(01, "data1");
		map.put(02, "data2");
		map.put(03, "data1");
		map.put(02, "data3");
		System.out.println(map);
		
		}

	public static void main(String[] args) {
		
	DemoCollection ob = new DemoCollection();
	ob.demo();
		

	}

}
