package lesson2;

import java.util.PriorityQueue;

public class collectionsPriorityQueue 
{
	public static void main(String[] args) {
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
			
	}
}