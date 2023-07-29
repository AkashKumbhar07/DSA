
public class revStack {
	public static void main(String[] args) {
		reverseString();
	}

	public static void reverseString() {
		String str="Hello";
		System.out.println("String str : "+str);
		Stack s=new Stack(str.length());
		
		for(int i=0;i<str.length();i++) {
			s.push(str.charAt(i));
		}
		String s1="";
		for(int i=0;i<str.length();i++) {
			s1+=s.pop();
		}
		System.out.println("String After Reverse str : "+s1);
		}
	
}
