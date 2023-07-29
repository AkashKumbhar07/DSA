package tree;

public class TesterTree {

	public static void main(String[] args) {
		Tree t=new Tree();  //null tree
		t.insert(12);
		t.insert(7);
		t.insert(25);
		t.insert(9);
		System.out.println("\nInorder -");
		t.inorder(t.getRoot());
	}

}
