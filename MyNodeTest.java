package LinkListPractice;

import org.junit.Assert;

import org.junit.Test;

public class MyNodeTest {
	 @Test
	 public void given3NumbersWhenAddedToLinkedlistShouldBeAddedToTop(){
	        MyNode<Integer> myFirstNode = new MyNode<>(70);
	        MyNode<Integer> mySecondNode = new MyNode<>(30);
	        MyNode<Integer> myThirdNode = new MyNode<>(56);
	        
	        MyLinkedList<Integer> MyLinkedlist=new MyLinkedList<Integer>();
	        MyLinkedlist.add(myFirstNode);
	        MyLinkedlist.add(mySecondNode);
	        MyLinkedlist.add(myThirdNode);
	        MyLinkedlist.printMyNodes();
	        
	        boolean result= MyLinkedlist.head.getNext().equals(myThirdNode) &&
	        		MyLinkedlist.head.getNext().equals(mySecondNode) &&
	        		MyLinkedlist.head.getNext().equals(myFirstNode);
	        Assert.assertTrue(result);
	        
	 } 

	}