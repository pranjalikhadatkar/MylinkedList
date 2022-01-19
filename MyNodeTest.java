package LinkListPractice;

import org.junit.Assert;

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
	        
	        MyLinkedlist.pop();
	        System.out.print("Linked List after popping first element: ");
	        MyLinkedlist.printMyNodes();
	        
	        boolean result= MyLinkedlist.equals(mySecondNode) &&
	        		MyLinkedlist.equals(myThirdNode); 
	        Assert.assertTrue(result);    
	     }
	   }