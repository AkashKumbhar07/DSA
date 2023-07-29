package dyque;

public class TesterDyQ {
	public static void main(String[] args) {
		DynQueue d=new DynQueue();
		d.enque(11);
		d.enque(22);
		d.enque(33);
		d.display();
		System.out.println("\nDeleted Element from Queue "+d.deque().getData());
		d.display();
		System.out.println("\nFirst Element from Queue "+d.peak().getData());
	}
}
