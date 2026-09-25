package genericpackage;

public class GenericsOldStyle {

	private Object t;

	public Object get() {
		return t;
	}

	public void set(Object t) {
		this.t = t;
	}

	public static void main(String args[]) {

		GenericsOldStyle type = new GenericsOldStyle();

		type.set("Bini");

		String str = (String) type.get();

		System.out.println(str);

		type.set(20);

		// Type casting, error-prone and can cause ClassCastException
		str = (String) type.get();

		System.out.println(str);
	}
}