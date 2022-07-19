package lesson2;

import java.util.Set;
import java.util.TreeSet;

public class collectionsTreeSet {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		set.add("Banana");
		set.add("Cheery");
		set.add("Almonds");
		set.add("Apple");
		//set.add(null);      null is  not allowed
		System.out.println(set);
		System.out.println("Size: "+set.size());
		System.out.println("Contains: "+set.contains("Banana"));
	}

}
