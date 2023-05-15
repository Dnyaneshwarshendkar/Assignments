package com.Queue;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

class IntComparator implements Comparator<Integer>
{
	@Override
	public int compare(Integer o1,Integer o2)
	{
		return o2-01;
	}
}

public class PriorityQueueDemo1 {
	
	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		
		pq.add(12);
		pq.add(87);
		pq.add(78);
		pq.add(65);
	}

}
