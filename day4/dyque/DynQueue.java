package dyque;

public class DynQueue {
	private QNode front, rear;

	public DynQueue() {
		setFront(setRear(null));
	}

	public QNode getFront() {
		return front;
	}

	public void setFront(QNode front) {
		this.front = front;
	}

	public QNode getRear() {
		return rear;
	}

	public QNode setRear(QNode rear) {
		this.rear = rear;
		return rear;
	}

	public void enque(int v) {
		QNode nn=new QNode(v);
		if(nn==null)
			return ;
		if(rear==null)
			rear=front=nn;
		else {
			rear.setNext(nn);
			rear=nn;
		}
	}

	public QNode deque() {
		if(isEmpty())
		{
			System.out.println("\nQueue is Empty");
			return null;
		}
		QNode t=front;
		front=front.getNext();
		t.setNext(null);
		return t;
		
	}

	public QNode peak() {
		if(isEmpty())
		{
			System.out.println("\nQueue is Empty");
			return null;
		}
		
		return front;
	}

	public void display() {
		if(isEmpty())
		{
			System.out.println("\nQueue is Empty");
			return;
		}
		System.out.println("\nQueue Elements -");
		for(QNode t=front;t!=null;t=t.getNext())
			System.out.print("\t"+t.getData());
		
	}

	public boolean isEmpty() {
//			if(rear==null)
//				return true;
//			return false
		
		return rear==null;
	}

}
