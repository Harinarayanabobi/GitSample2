package collectionpack;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetCollectionDemo {

	public static void main(String[] args) {
		
		Set<Integer> setHash = new HashSet<>();
		Set<Integer> setLinked = new LinkedHashSet<>();
		Set<Integer> setTree = new TreeSet<>();
		
		setHash.add(21);
		setHash.add(12);
		setHash.add(32);
		setHash.add(33);
		setHash.add(53);
		setHash.add(3);
		
		System.out.println("HASH SET: ");
		for(int h : setHash) {
			System.out.println(h);
		}
		
		setLinked.add(21);
		setLinked.add(12);
		setLinked.add(32);
		setLinked.add(33);
		setLinked.add(53);
		setLinked.add(3);
		
		System.out.println("Linked SET: ");
		for(int l : setLinked) {
			System.out.println(l);
		}
		
		setTree.add(21);
		setTree.add(12);
		setTree.add(32);
		setTree.add(33);
		setTree.add(53);
		setTree.add(3);
		
		System.out.println("SET TREE : ");
		for(int t : setTree) {
			System.out.println(t);
		}
	}

}
