
public class Variable5 { // class block

	public static void main(String[] args) { // method block
		{
			double d = 10.;
			int i = (int) d;

			System.out.println(i);
		}

		{
			/*
			 * int i = 1; double d = i; System.out.println(d);
			 */

		}
		{
			byte b = 127; // -128 ~ 127
			int i = b;
			System.out.println(b);
		}
		{
			byte b = -128;
			int i = b;
			System.out.println(i);
		}
		{
			int i = 128;
			byte b = (byte) i;

			System.out.println(b);
		}
	}
}
