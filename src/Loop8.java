/**
* 피보나치 수열
* @author smart02
* 
*/
public class Loop8 {

	public static void main(String[] args) {
		int m = 0;
		int n = 1;
		int o = m + n;
		for (int r=1; r<=7; r++) {
			System.out.printf("%d %d %d \n", m,n,o);
			m = n;
			n = o;
			o = m + n;
			// System.out.printf("%d %d %d \n", m,n,o);
		}
	}
}
	


	



