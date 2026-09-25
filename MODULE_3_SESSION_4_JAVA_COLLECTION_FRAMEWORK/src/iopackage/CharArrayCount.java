package iopackage;

public class CharArrayCount {
	public static void main(String[] args) {
		int count = 0;
		char[] str = new char[26];

		System.out.println(str[0] == '\u0000'); // true -default value \u0000.
		System.out.println(str[1] == '\u0000'); // true -default value \u0000.
		System.out.println("str[0]=" + str[0]);
		while (str[count] != '\u0000') {
			count++;
		}
		System.out.println("The length of the string is " + count);
		str[0] = 'B';
		str[1] = 'i';
		while (str[count] != '\u0000') {
			count++;
		}
		System.out.println("The length of the string is " + count);
	}
}