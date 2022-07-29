package lesson2;
import java.util.*;
public class Collections {
	public static void main(String[] args) {
		
		// ArrayList
		System.out.println("ArrayList:");
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		list.add("Apple");
		list.add(null);
		System.out.println("Size: "+list.size());
		System.out.println(list);
		System.out.println("Element at index 4: "+list.get(4));
		list.add("Pizza");
		System.out.println("List Contains Apple? :"+list.contains("Apple"));
		list.remove(0);
		list.remove(null);
		System.out.println(list);
		//print a list using for loop
		for(String s:list) {
			System.out.println("Using For Loop: "+s);
		}
		//iterate using iterator
		Iterator<String> itr= list.iterator();
		while(itr.hasNext()) {
			System.out.println("Using Iterator: "+itr.next());
		}
		
		// Vector
		System.out.println("\nVector:");
		Vector<String> vect= new Vector<String>();
		System.out.println("Size:"+vect.size());
		vect.add("Apple");
		vect.add("Banana");
		vect.add("Cherry");
		vect.add("Apple");// duplicate value are allowed in list
		vect.add(null);// list contains null value
		System.out.println("After Adding an Elements :"+vect.size());
		System.out.println(vect);
		System.out.println("Element at index 4: "+vect.get(4));
		vect.add("Pizza");
		System.out.println(vect);
		System.out.println("List Contains Apple? :"+vect.contains("Apple"));
		vect.remove(0);
		vect.remove(null);
		System.out.println(vect);
		
		//LinkedList
		System.out.println("\nLinkedList:");
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(56);
		ll.add(67);
		ll.add(89);
		ll.add(13);
		System.out.println("Size: "+ll.size());
		System.out.println(ll);
		ll.remove(3);
		System.out.println(ll);
		System.out.println(ll.get(2));
		ll.add(2,0);
		System.out.println(ll);
		System.out.println("First element: "+ll.getFirst()+"\tLast element: "+ll.getLast());
		
		//PriorityQueue
		System.out.println("\nPriorityQueue:");
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(56);
		pq.add(67);
		pq.add(13);
		pq.add(79);
		pq.add(4);
		pq.add(100);
		System.out.println(pq);
		System.out.println("Top element: "+pq.peek());
		System.out.println("Printig top and removing: "+pq.poll());
		System.out.println("Top element: "+pq.peek());
		pq.remove(67);
		System.out.println("After remove: "+pq);
		
		//HashSet
		System.out.println("\nHashSet:");
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(20);
		set.add(55);
		set.add(2);
		set.add(36);
		set.add(67);
		set.add(null);
		System.out.println("Size: "+set.size());
		System.out.println(set);
		System.out.println("Contains: "+set.contains(55));
		set.remove(null);
		
		//LinkedHashSet
		System.out.println("\nLinkedHashSet:");
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
		
		//TreeSet
		System.out.println("\nTreeSet:");
		Set<String> tset = new TreeSet<String>();
		tset.add("Banana");
		tset.add("Cheery");
		tset.add("Almonds");
		tset.add("Apple");
		//set.add(null);      null is  not allowed
		System.out.println(tset);
		System.out.println("Size: "+tset.size());
		System.out.println("Contains: "+tset.contains("Banana"));
	}

}
