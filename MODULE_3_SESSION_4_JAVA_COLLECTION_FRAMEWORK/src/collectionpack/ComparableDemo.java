package collectionpack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	String name;
	int age;
	int id;
	public Student(String name, int age, int id) {
		this.name = name;
		this.age = age;
		this.id = id;
	}
	@Override
	public int compareTo(Student st) {
//		if(age == st.age)
//			return 0;
//		else if(age > st.age)
//			return 1;
//		else
//			return -1;	
		return Integer.compare(this.id, st.id);
	}		
}

public class ComparableDemo {

	public static void main(String[] args) {

		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("ANJU", 28, 111));
		students.add(new Student("MANJU", 19, 92));
		students.add(new Student("RENJU", 18, 13));
		students.add(new Student("SANJU", 7, 104));
		students.add(new Student("RAJU", 11, 15));
		
		Collections.sort(students);
		for(Student s : students) {
			System.out.println("=======================");
			System.out.println("NAME : "+s.name);
			System.out.println("AGE : "+s.age);
			System.out.println("ID : "+s.id);
			System.out.println("=======================");
		}

	}

}
