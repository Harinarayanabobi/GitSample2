package genericpackage;

class GenericTypes<T> {
	private T t;

	public T get() {
		return this.t;
	}

	public void set(T t1) {
		this.t = t1;
	}
}

public class GenericsMethodsBounds {
	// Generics in method
//	public static <T> boolean checkEquals(GenericTypes<T> g1, GenericTypes<T> g2) {
//		return g1.get().equals(g2.get());
//	}
	//check previous code

	// bounded type parameter
	// <T extends A & B & C>. In this case, A can be an interface or class.
	// If A is class then B and C should be an interface
	public static <T extends Comparable<T>> int compare(T t1, T t2) {
		return t1.compareTo(t2);
	}

	public static void main(String args[]) {
		GenericTypes<String> g1 = new GenericTypes<>();
		g1.set("Bini");
		GenericTypes<String> g2 = new GenericTypes<>();
		g2.set("bini");
		boolean check = GenericsMethodsBounds.<String>checkEquals(g1, g2);
		System.out.println(check);

		// above statement can be written simply as
		check = GenericsMethodsBounds.checkEquals(g1, g2);
		System.out.println(check);

		System.out.println(GenericsMethodsBounds.compare("bini", "bini")); // if equals =0
		System.out.println(GenericsMethodsBounds.compare("bini", "Bini")); // lexicographically greater +
		System.out.println(GenericsMethodsBounds.compare("bini", "anu")); // lexicographically
	}
}