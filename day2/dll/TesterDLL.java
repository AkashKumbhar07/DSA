package dll;

public class TesterDLL {

	public static void main(String[] args) {

		DoublyLL d1=new DoublyLL()	;
		d1.insertAtBeg();
		d1.insertAtBeg();
		d1.insertAtLast();
		d1.forwordDisplay();
		d1.backwordDisplay();
		//d1.search("Ajay");
		
		d1.insertAtPos(4);
		
		d1.forwordDisplay();
		d1.backwordDisplay();
	}

}
