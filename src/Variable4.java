
public class Variable4 { // class block

	public static void main(String[] args) { // method block
		{
			double d = 10;
			
			int i = (int) d;

			System.out.println(i);
		}
	

	{
		
		int i = 127;
		byte b = (byte) i;
		//double d = i;
		System.out.println(b);

	}
	{
		int i = -129; 
		byte b = (byte) i;
		//double d = i;
		System.out.println(b); // underflow(?)
	}
	{
		int i = 128; 
		byte b = (byte) i;
		//double d = i;
		System.out.println(b); // overflow
	}
	}
}
