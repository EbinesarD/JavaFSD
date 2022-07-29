package lesson2;

import java.util.LinkedHashSet;

public class collectionsLinkedHashSet {
	public static void main(String[] args) {
		// ordered version of hashset
		LinkedHashSet<String> lset = new LinkedHashSet<String>();
		lset.add("A");
		lset.add("B");
		lset.add("C");
		lset.add("D");
		lset.add("A"); // duplicates not allowed
		lset.add("E");
		lset.add(null);
		System.out.println("Size: "+lset.size());
		System.out.println(lset);
		System.out.println(lset.contains("E"));
		lset.remove(null);
		System.out.println(lset);
	}

}
