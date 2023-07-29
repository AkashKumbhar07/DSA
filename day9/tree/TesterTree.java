package tree;

public class TesterTree {

	public static void main(String[] args) {
		Tree t=new Tree();  //null tree
		t.insert(40);
		t.insert(30);
		t.insert(76);
		t.insert(25);
		t.insert(38);
		t.insert(55);	
		t.insert(35);
		t.insert(95);
		t.insert(65);
		t.insert(62);
		t.insert(39);
	
		
		System.out.println("\nInorder  With Recurssion -");
		t.inorder(t.getRoot());
		//t.delete(62);
//		t.delete(65);
		System.out.println("\nInorder  Without Recurssion -");
		t.inorder();
		System.out.println("\nPreorder With Recurssion -");
		t.preorder(t.getRoot());
		//t.delete(62);
//		t.delete(65);
		System.out.println("\nPreorder  Without Recurssion -");
		t.preorder();
		System.out.println("\nPostorder With Recurssion -");
		t.postorder(t.getRoot());
		//t.delete(62);
//		t.delete(65);
		System.out.println("\nPostorder  Without Recurssion -");
		t.postorder();
		
		System.out.println("\nBFS  Without Recurssion -");
		t.bfs();
	}

}
