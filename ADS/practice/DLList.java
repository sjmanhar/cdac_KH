class DLList{
	Node head;
	static class Node{
		int data;
		Node prev;
		Node next;
		
		Node(int d){
			data = d;
			prev=next = null;
		}
		/*
		void display(){
		Node n= head;
		while(n!=null){
			System.out.print(n.data+ " -->");
			n= n.next;
		}
	}*/
		void insert(int new_data){
			Node new_node = new Node(new_data);
			new_node.next = head;
			new_node.prev = null;
			if(head!= null){
			head.prev= new_node;
			}
			head= new_node;
		}
	}
	public static void main(String...args){
		DLList d1 = new DLList();
		d1.head = new Node(1);
		d1.display();
	}
}