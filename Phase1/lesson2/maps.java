package lesson2;

import java.util.*;

public class maps {
	public static void main(String[] args) {
		//HashMap
		System.out.println("HashMap: ");
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "A");
		hm.put(2, "B");
		hm.put(3, "C");
		for(Map.Entry m: hm.entrySet())
		{
			System.out.println("HashMap elements: "+m.getKey()+" "+m.getValue());
		}
		
		// TreeMap
		System.out.println("\nTreeMap: ");
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		tm.put(4,"X");
		tm.put(5,"y");
		tm.put(6,"z");
		for(Map.Entry t : tm.entrySet())
		{
			System.out.println("Treemap elements: "+t.getKey()+" "+t.getValue());
		}
		
		//HashTable
		System.out.println("\nHashTable: ");
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
		ht.put(7,"P");  
		ht.put(8,"Q");  
		ht.put(9,"R");  
	    ht.put(10,"S");
	    for(Map.Entry n:ht.entrySet())
	    {    
	    	System.out.println("HashTable elements: "+n.getKey()+" "+n.getValue());    
	    }

	}

}
