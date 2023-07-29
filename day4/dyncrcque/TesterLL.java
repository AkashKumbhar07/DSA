//Implement Linked List for int values

package dyncrcque;

public class TesterLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DynCircularQueue l1=new DynCircularQueue();
		
		l1.insertAtRear(6);
		l1.insertAtRear(8);
		l1.insertAtRear(16);
		l1.insertAtRear(88);
		l1.display(); //88   16  56  23  6   8     


		System.out.println("Deleted Element from Queue : "+l1.deleteAtFront().getData());
		l1.display();
			
	}

}
