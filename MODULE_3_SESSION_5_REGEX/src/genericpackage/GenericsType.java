package genericpackage;

public class GenericsType<T> {
	private T t;

	public T get() {
		return this.t;
	}

	public void set(T t1) {
		this.t = t1;
	}

	public static void main(String args[]) {
		GenericsType<String> type = new GenericsType<>(); // T as String
		type.set("Bini");
		System.out.println(type.get());

		GenericsType<Integer> type2 = new GenericsType<>(); // T as Integer
		type2.set(10); // valid
		System.out.println(type2.get());
	}
}