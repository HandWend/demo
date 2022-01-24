
public class Variable2 {

	public static void main(String[] args) {
		byte b = 127; 
		// byte b1 = 128; error
		short s = 1;
		int i = 10;
		long l = 11;
		double d = 10.0; // widen(o), narrow(x)
		double d1= 10;	// d compare with d1
		double d2 = 2;  
		double d3 = 3.D;  // point after write 'D' like float
		double d4 = 4.;   // only point with no number or alp
		char c = 'A';	
		float f = 1.1f;		// float must have .f
		boolean sw= true;	
		boolean sw2= false;
		
		System.out.println("글\t자");		// word [tab] word
		System.out.println("글\n자");		// word [enter] word
		System.out.println("글\"자");  	// word ["] word
		System.out.println("글\\자"); 	// word [\] word
		System.out.println(b);
		System.out.println(i);
		System.out.println(l);
		
		System.out.println(d);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		
		System.out.println(c);
		
		System.out.println(f);
		System.out.println(sw);
		System.out.println(sw2);
	}

}
