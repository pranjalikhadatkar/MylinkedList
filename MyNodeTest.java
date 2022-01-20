package LinkListPractice;

import org.junit.Test;

public class MyNodeTest {
	 @Test
	 public void givenLastElementWhenDeletedShouldPassedLinkedlistResult(){
	        MyNode<Integer> myFirstNode = new MyNode<>(56);
	        MyNode<Integer> mySecondNode = new MyNode<>(30);
	        MyNode<Integer> myThirdNode = new MyNode<>(70);
	        

	        MyLinkedList<Integer> MyLinkedlist=new MyLinkedList<Integer>();
	        MyLinkedlist.add(myFirstNode);
	        MyLinkedlist.append(mySecondNode);
	        MyLinkedlist.append(myThirdNode);
	        System.out.print("Initial Linked List: ");
	        MyLinkedlist.printMyNodes();
	        
	        System.out.println("Linked List after popping last element: "); 
	       System.out.println( MyLinkedlist.popLast());

	        // check if last element of linked list popped
	        boolean result = MyLinkedlist.head.equals(myFirstNode) &&
	        		MyLinkedlist.tail.equals(mySecondNode) ;
	    }
	}