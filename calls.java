public class calls {
  // we got the values we expected
	public static void func_c(int a, int b, int c) {
		a = 8;
		// show the stack diagram when you reach this comment.
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void func_b(int a, int b, int c) {
		b = 6;
		c = 7;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		func_c(a, b, c );
	}

	public static void func_a(int a, int b, int c) {
		a = 4;
		c = 5;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		func_b( a, b, c );
	}

	public static void main ( String[] argv ) {
		int a = 1, b = 2, c = 3;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		func_a( a, b, c );
	}
}
