package mypackage;

import java.util.PriorityQueue;

public class Queue1 {

	public static void main(String[] args) {
		{
			PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
			pq.add(10);
			pq.add(20);
			pq.add(30);
			
			System.out.println(pq.peek());//peek wil tell who is tr in the queue
			System.out.println(pq.poll());//give 1st element and remove that frm queue
			System.out.println(pq.peek());// now disp second element
		}

	}

}
