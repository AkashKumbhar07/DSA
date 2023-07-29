package cirqueue;
public class CirQueue {
	private int data[];
	private int r, f,size;

	public CirQueue(int size) {
		data = new int[size];
		this.size=size;
		r = f = -1;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}
	
	public void enque(int v) {
		if(isFull())
		{
			System.out.println("Queue is Full");
			return;
		}
		if(r==-1)
			f=0;
		data[++r%size]=v;
		
	}
	public int deque() {
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return -1;
		}
		
		int v=data[f++%size];
		if(f==r+1)
			r=f=-1;
		return v;
		
	}
		
	
	
	public boolean isEmpty() {
		if(r==-1)
			return true;
		return false;
	}

	public boolean isFull() {
		if((r==data.length-1&&f==0)||f==r+1)
			return true;
		return false;

	}

	public void display() {
		if(isEmpty())
		{
			System.out.println("Queue is Empty");
			return;
		}
		System.out.print("\nQueue Elements :");
		for(int i=f;i<=r;i++) {
			System.out.print("\t"+data[i%data.length]);
		}
	}
}
