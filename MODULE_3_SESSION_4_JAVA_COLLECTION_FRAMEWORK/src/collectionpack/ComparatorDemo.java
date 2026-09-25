package collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee {
	int empno;
	String name;
	int age;

	public Employee(int empno, String name, int age) {
		this.empno = empno;
		this.name = name;
		this.age = age;
	}

}

class AgeComparator implements Comparator<Staff> {

	@Override
	public int compare(Staff e1, Staff e2) {
		if (e1.age == e2.age)
			return 0;
		else if (e1.age > e2.age)
			return 1;
		else
			return -1;

	}

}

class NameComparator implements Comparator<Staff> {

	@Override
	public int compare(Staff e1, Staff e2) {

		return e1.name.compareTo(e2.name);
	}

}

public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<Staff> al = new ArrayList<Staff>();
		al.add(new Staff(114, "DEVU", 25));
		al.add(new Staff(105, "BINI", 26));
		al.add(new Staff(108, "KRIPA", 24));

		System.out.println("Sorting by name: ");

		Collections.sort(al, new NameComparator());
		for (Staff emp : al) {
			System.out.println(emp.empno + " " + emp.name + " " + emp.age);

		}

		System.out.println("Sorting by age: ");

		Collections.sort(al, new AgeComparator());
		for (Staff emp : al) {
			System.out.println(emp.empno + " " + emp.name + " " + emp.age);

		}
	}

}
