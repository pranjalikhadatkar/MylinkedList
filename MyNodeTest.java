package LinkListPractice;

import org.junit.Test;

public class MyNodeTest {
	 @Test
	 public void givenElementWhenInsertInBetweenPerticularNodeShouldPassedLinkedListResult() {
			MyNode<Integer> myFirstNode = new MyNode<>(56);
			MyNode<Integer> mySecondNode = new MyNode<>(30);
			MyNode<Integer> newNode = new MyNode<>(40);
			MyNode<Integer> myThirdNode = new MyNode<>(70);
			
			MyLinkedList myLinkedList = new MyLinkedList();
			myLinkedList.append(myFirstNode);
			myLinkedList.append(mySecondNode);
			
			myLinkedList.DeleteNode(40);
			myLinkedList.append(myThirdNode);
			myLinkedList.printMyNode();
			
		}
	}