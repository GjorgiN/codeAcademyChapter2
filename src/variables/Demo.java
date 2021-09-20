package variables;

public class Demo {

	public static void main(String[] args) {

		byte x;
		int a = 270;
		double b = 128.128;
		
		System.out.println("int converted to byte");
		
		// cast example
		x = (byte) a;
		
		System.out.println("a = " + a);
		System.out.println("x = " + x);
		
		System.out.println("double converted to int");
		
		// cast double to integer
		a = (int) b;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		System.out.println("double converted to byte");
		
		x = (byte) b;
		
		// print the double b casted as byte
		System.out.println("x = " + x);
		// print double b
		System.out.println("b = " + b);
		
	}

}
