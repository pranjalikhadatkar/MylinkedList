package LinkListPractice;

import org.junit.Test;

public class MyNodeTest {
	 @Test
	 public void givenElementWhenSearchedShouldPassedLinkedlistResult(){
	        MyNode<Integer> myFirstNode = new MyNode<>(56);
	        MyNode<Integer> mySecondNode = new MyNode<>(30);
	        MyNode<Integer> myThirdNode = new MyNode<>(70);
	       
	 }
	 
	  public static INode<Integer> searchElementLinkedList(Integer search_key,Integer ...args){
	        MyLinkedList myLinkedList = new MyLinkedList();
	        for (Integer i:args){
	            MyNode<Integer> myNode = new MyNode<>(i);
	            myLinkedList.add(myNode);
	        }
	        MyNode<Integer> mysearchNode = new MyNode<>(search_key);

	        System.out.print("Linked List: ");
	        myLinkedList.printMyNodes();
	        return myLinkedList.search(mysearchNode);
	    }
}