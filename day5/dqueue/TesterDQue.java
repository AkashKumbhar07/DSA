package dqueue;

import java.util.Scanner;

public class TesterDQue {
	public static void main(String[] args) {
		DQueue dq = new DQueue(5);
		try (Scanner sc = new Scanner(System.in)) {
			while (true) {
				System.out.println(
						"\nEnter "
				+ "\n1. for Input Restricted Queue" 
				+ "\n2. for Output Restricted Queue" 
				+ "\n3. for Exit \t");
				switch (sc.nextInt()) {
				case 1:
					System.out.println("\nInput Restricted Queue :");
					while (true) {
						System.out.println("\nEnter "
					+ "\n1. for Enqueue At Rear" 
					+ "\n2. for Dequeue At Rear"
					+ "\n3. for Dequeue At Front" 
					+ "\n4. For Display Queue" 
					+ "\n5. for Exit");
						switch (sc.nextInt()) {
						case 1:
							System.out.println("\nEnter a number to insert into queue :");
							dq.enqueueAtRear(sc.nextInt());
							break;
						case 2:
							dq.dequeueAtRear();
							break;
						case 3:
							dq.dequeueAtFront();
							break;

						case 4:
							dq.display();
							break;
						case 5:
							System.exit(0);
						}
					}
				case 2:
					System.out.println("\nOutput Restricted Queue :");
					while (true) {
						
						System.out.println("\nEnter "
						+ "\n1. for Enqueue At Rear" 
						+ "\n2. for Enqueue At Front"
						+ "\n3. for Dequeue At Front" 
						+ "\n4. For Display Queue" 
						+ "\n5. for Exit");
						switch (sc.nextInt()) {
						case 1:
							System.out.println("\nEnter a number to insert into queue :");
							dq.enqueueAtRear(sc.nextInt());
							break;
						case 2:
							System.out.println("\nEnter a number to insert into queue :");
							dq.enqueueAtFront(sc.nextInt());
							break;
						case 3:
							dq.dequeueAtFront();
							break;
						case 4:
							dq.display();
							break;
						case 5:
							System.exit(0);
						}
					}
				case 3:
					System.exit(0);

				}
			}
		}

	}
}
