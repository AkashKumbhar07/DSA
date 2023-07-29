package cirqueue;

public class TesterCirQue {

	public static void main(String[] args) {
		CirQueue q=new CirQueue(5);
		q.enque(12);
		q.enque(14);
		q.enque(55);
		q.enque(72);
		q.enque(98);
		q.enque(8);
		q.display();
//		System.out.println("\nFirst Element of Queue :"+q.peak());
		int v=q.deque();
		if(v!=-1)
			System.out.println("\nDeleted Element from queue - "+v);
//		q.enque(88);
		 v=q.deque();
		if(v!=-1)
			System.out.println("\nDeleted Element from queue - "+v);
		q.display();
		q.enque(34);
		q.enque(45);
		q.display();
		 v=q.deque();
			if(v!=-1)
				System.out.println("\nDeleted Element from queue - "+v);
			q.display();
			v=q.deque();
			if(v!=-1)
				System.out.println("\nDeleted Element from queue - "+v);
			q.display();
			v=q.deque();
			if(v!=-1)
				System.out.println("\nDeleted Element from queue - "+v);
			q.display();
			
	}

}
