package tree;

public class TesterHeapSort {

	public static void main(String[] args) {
		Tree t=new Tree();  //null tree
		t.insert(40);
		t.insert(30);
		t.insert(76);
		t.insert(25);
		t.insert(38);
		t.insert(95);
		
		System.out.println("\nInorder  With Recurssion -");
		t.inorder(t.getRoot());

		t.heapSort();
	}

}
