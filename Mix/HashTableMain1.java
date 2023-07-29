import java.util.LinkedList;
import java.util.Scanner;

class HashTable{
	
	static class Pair{
		private int key;
		private String value;
		
		public Pair() {
			key=0;
			value="";
			
		}
		public Pair(int key, String value) {
			this.key = key;
			this.value = value;
		}
		@Override
		public String toString() {
			return "Pair [key=" + key + ", value=" + value + "]";
		}
		
	}
		private final int SLOTS=10;
		private LinkedList<Pair> table[];
	
		public int Hash(int key) {
		return key%SLOTS;
	}
		
		public HashTable() {
			table = new LinkedList[SLOTS];
			for(int i=0;i<SLOTS;i++)
				table[i]= new LinkedList<>();
		}
		
		public void put(int key, String value) {
			int slot = Hash(key);
			LinkedList<Pair> bucket= table[slot];
			for(Pair pair:bucket) {
				if(pair.key==key)
					pair.value=value;
				return;
			}
			Pair pair= new Pair(key,value);
					bucket.add(pair);
		}
		
		
		public String get(int key) {
			int slot= Hash(key);
			LinkedList<Pair> bucket= table[slot];
			for(Pair pair:bucket) {
				if(pair.key==key)
					return pair.value;	
			}
			return null;
		}
}



public class HashTableMain1 {

	public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
	  HashTable tb= new HashTable();
	  
	  tb.put(9, "AKASH");
	  tb.put(69, "PRASHIK");
	  tb.put(29, "DEVRAJ");
	  tb.put(70, "PRATIK");
	  
	  System.out.println("Enter The Roll to Show Student Name :");
	  int roll= sc.nextInt();
	  String student=tb.get(roll);
	  System.out.println("STUDENT FOUND"+student);
	  
	  sc.close();
	}

}
