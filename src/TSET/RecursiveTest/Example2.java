package TSET.RecursiveTest;

public class Example2 {

	
	static class Node{
		int value;
		Node next;
		
		
		public Node(int value, Node next) {
			this.value= value;
			this.next = next;
		}
		
		
		public void PrintAll() {
			System.out.printf("%d ", this.value);
			
			if(next != null) {
				next.PrintAll();
			}
			else {
				return;
			}
			
		}
		
		public void addTail(int value) {
			
			if(next!=null) {
				next.addTail(value);
			}
			
			else {
				 next = new Node(value,null);
			}
			
			
		}
		
	}
	
	
	public static void main(String[] args) {
		Node root = new Node(0 , null);
		
		for(int i=1; i<=10; ++i) {
			root.addTail(i);
		}
	
		root.PrintAll();
	
	}
//0~10 순서대로 출력
	
	
}
