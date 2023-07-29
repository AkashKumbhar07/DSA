package que;

public class TesterQue {

	public static void main(String[] args) {
		Queue q=new Queue(5);
		q.enque(12);
		q.enque(14);
		q.enque(55);
		q.enque(72);
		q.enque(98);
		q.enque(8);
		q.display();
		System.out.println("\nFirst Element of Queue :"+q.peak());
		int v=q.deque();
		if(v!=-1)
			System.out.println("Deleted Element from queue - "+v);
		q.enque(88);
		q.display();
	}

}
