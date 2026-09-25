package collectionpack;

import java.util.Hashtable;
import java.util.Vector;

public class BeforeJCF {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, 3, 4, 5 };

		Vector v = new Vector();

		Hashtable<Integer, String> h = new Hashtable();
		
		v.addElement(1);
		v.addElement(2);
		
		h.put(1, "Luminar");
		h.put(2, "Java");
		
		System.out.println(arr[0]);
		System.out.println(v.elementAt(0));
		System.out.println(h.get(1));

	}

}
