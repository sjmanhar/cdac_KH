class List{
	Node start;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data= d;
			next= null;
		}
	}
	
	void display(){
		Node n= start;
		while(n!=null){
			System.out.print(n.data+ " -->");
			n= n.next;
		}
	}
	
	void insert(int new_data){
		Node new_node = new Node(new_data);
		new_node.next= start;
		start= new_node;
	}
	void insertAfter( Node prev_node,int new_data){
		Node new_node = new Node(new_data);
		new_node.next=prev_node.next;
		prev_node.next= new_node;
	}
	void append(int new_data){
		Node new_node = new Node(new_data);
		if(start == null){ // acktracking
			start = new Node(new_data);
			return;
		}
		Node n = start;
		while(n.next!= null){
			n= n.next;
		}
		n.next = new_node;
		return;
	}
	
	void deleteNode(int key){
		Node  temp= start, prev = null;
		if(temp!= null && temp.data ==key){
			start= temp.next;
			return; //delete  at beginning
		}
		
		while(temp!= null && temp.data!= key){
			prev = temp;
			temp= temp.next;
		}
		
		if(temp ==null){
			return;
		
		}
		prev.next = temp.next; 
	}
	
	public static void main(String...args){
		List l1= new List();
		l1.start = new Node(5);
		Node sec= new Node(10);
		Node third = new Node(20);
		
		l1.start.next= sec;
		sec.next= third; //5 -->10 -->20 -->
		
		l1.insert(30);
		l1.insert(40);//40 -->30 -->5 -->10 -->20 -->
		
		l1.insertAfter(l1.start.next , 50);
		//l1.insertAfter(l1.start.next.next , 455);
		
		l1.append(700); //40 -->30 -->50 -->5 -->10 -->20 -->700 -->
		l1.deleteNode(5);
		l1.display();
		//stem.out.print(start.data);
		//stem.out.print(sec.data);
	}
}