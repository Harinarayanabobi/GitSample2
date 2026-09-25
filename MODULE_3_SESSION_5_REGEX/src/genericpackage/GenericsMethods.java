package genericpackage;

class GenType<T> {
	private T t;

	public T get() {
		return this.t;
	}

	public void set(T t1) {
		this.t = t1;
	}
}

public class GenericsMethods {
	// Generics in method
	public static <T> boolean isEqual(GenType<T> g1, GenType<T> g2) {
		return g1.get().equals(g2.get());
	}

	// main()
	public static void main(String args[]) {
		// ---T as String---
		GenType<String> g1 = new GenType<>();
		g1.set("Bini"); // first object g1

		GenType<String> g2 = new GenType<>();
		g2.set("bini"); // second object g1

		boolean isEqual = GenericsMethods.<String>isEqual(g1, g2);
		System.out.println(isEqual);

		// above statement can be written simply as
		isEqual = GenericsMethods.isEqual(g1, g2);
		System.out.println(isEqual);

		// ---T as Integer---
		GenType<Integer> g3 = new GenType<>();
		g3.set(10); // first object g1

		GenType<Integer> g4 = new GenType<>();
		g4.set(20); // second object g1

		isEqual = GenericsMethods.isEqual(g3, g4);
		System.out.println(isEqual);

		// ---T as Float---
		GenType<Float> g5 = new GenType<>();
		g5.set(10.5f); // first object g1

		GenType<Float> g6 = new GenType<>();
		g6.set(10.5f); // second object g1

		isEqual = GenericsMethods.isEqual(g5, g6);
		System.out.println(isEqual);
	}
}