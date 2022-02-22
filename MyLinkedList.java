package LinkListPractice;

public class MyLinkedList<K> {
	public INode<K> head;
	public INode<K> tail;
	
	public MyLinkedList() {
		this.head=null;
		this.tail=null;
	}
	
	public void add(INode<K> newNode)
	{
		if(this.tail == null)
		{
			this.tail = newNode;
		}
		if(this.head == null)
		{
			this.head = newNode;
		}
		else
		{
			INode<K> tempNode = this.head;
			this.head= newNode;
			this.head.setNext(tempNode);
		}
	}
	
	public void append(INode<K> MyNode)
	{
		if(this.head == null) {
			this.head = MyNode;
		}
		if(this.tail == null) {
			this.tail = MyNode;
		}else {
			this.tail.setNext(MyNode);
			this.tail = MyNode;
		}
	}
	
	public void insert(INode<K> myNode, INode<K> newNode)
	{
		INode<K> tempNode = myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	
	public INode<K> pop(){
		INode<K> tempNode = this.head;
		this.head = head.getNext();
		return tempNode;	
	}
	
	 public INode<K> popLast(){
	        INode<K> tempNode = this.head;
	        while (tempNode.getNext().getNext()!=null){
	            tempNode = tempNode.getNext();
	        }

	        tempNode.setNext(null);
	        return head;        
	    }
	 
	 public INode DeleteNode(int i) {
	        if (this.head == null) {
	            System.out.println("List is Empty");
	        }
	        INode tempNode = head;
			while (tempNode.getNext() != null) {
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(null);
			System.out.println("deleted Node is: " + i);
			System.out.println("Size of Linkedlist is: " + 3);
			
			return null;
		}    
	 
	 public void printMyNode() {
			System.out.println(head);
	 }
}
