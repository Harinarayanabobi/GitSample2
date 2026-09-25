package collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class TestHashSet {
	public static void main(String[] args) {

		List<String> lst = new ArrayList<String>();
		lst.add("JAVA");
		lst.add("JSP");
		lst.add("STRUTS");
		lst.add("HIBERNATE");
		lst.add("JSP"); // adding duplicate
		lst.add("JAVA"); // adding duplicate
		
		System.out.println(lst);
		
		System.out.println("SOrted list:- \n");
		
		Collections.sort(lst);
		System.out.println(lst);
		
		System.out.println("REVERSE SOrted list:- \n");
		
		Collections.sort(lst, Collections.reverseOrder());
		System.out.println(lst);

//		// Creating HashSet object
//		HashSet<String> set = new HashSet<String>();
//
//		// Adding elements to HashSet
//		set.add("JAVA");
//		set.add("JSP");
//		set.add("STRUTS");
//		set.add("HIBERNATE");
//		set.add("JSP"); // adding duplicate
//		set.add("JAVA"); // adding duplicate
	}
}
