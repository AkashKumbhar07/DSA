package hello;



public class AscendingSinglyList {

	Node head;
	
//public boolean insertAtBeg(int data) {
//		
//	Node newNode = new Node(data);
//		if(newNode==null)
//			return false;
//		if(head==null)
//			head=newNode;
//		else {
//			newNode.next=head;
//			head=newNode;
//		}
//
//		return true;
//		
//	}

public void ascendingInsert(int data) {

		Node newNode = new Node(data);
		
		if (head == null) {
			head = newNode;
		}
		else {
 			
			Node temp = head;
			
			if(temp.data>newNode.data) {
				newNode.next=head;
				head=newNode;
				return;
			}	
			
//			boolean flag = false;
//			while (temp.next != null) {
//				if(temp.next.data>data) {
//					flag = true;
//					break;
//				}
//				temp = temp.next;
//			}
//			if(!flag) {				
//				temp.next = newNode;
//			}else {
//				newNode.next = temp.next;
//				temp.next=newNode;
//			}	
			
			while(temp.next != null) {
				
				if(temp.data<newNode.data && newNode.data < temp.next.data) {				
						newNode.next = temp.next;
						temp.next=newNode;
						return;
				}
				temp = temp.next;
			}
			temp.next = newNode;
			
			
			
			
			
			
		}
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.println("\t" + temp.data);
			temp = temp.next;
		}
	}

}
