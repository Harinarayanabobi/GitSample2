package collectionpack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListCollectionDemo {

	public static void main(String[] args) {
		
		List<Integer> ListArray = new ArrayList<>();
		List<Integer> ListLinked = new LinkedList<>();
		List<Integer> ListVector = new Vector<>();
		List<Integer> ListStack = new Stack<>();
		
		ListArray.add(10);
		ListArray.add(20);
		ListArray.add(30);
		
		ListLinked.add(100);
		ListLinked.add(200);
		ListLinked.add(300);
		
		ListVector.add(1000);
		ListVector.add(2000);
		ListVector.add(3000);
		
		ListStack.add(11);
		ListStack.add(11);
		ListStack.add(11);
		
		System.out.println("ARRAY LIST :- "+ListArray);
		System.out.println("LINKED LIST :- "+ListLinked);
		System.out.println("STACK :- "+ListStack);
		System.out.println("VECTOR :- "+ListVector);

	}

}
