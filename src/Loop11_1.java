/**
 * 별 찍기
 * 
 * @author smart02 ★
 */
public class Loop11_1 {

	public static void main(String[] args) {
		// 별 찍기 (star의 s, 반복의 r)
		//for (int s = 1; s <= 5; s++) {
		
			int s = 1;
			int r = 1;
			while (s<=5) {
			
			System.out.println("");
			s++;
				while (r <=s) {
				
				System.out.print('*');
				r++;
				
				}
			}
		
		/*
		System.out.println();
		System.out.println("=========");

		for (int s = 5; s >= 1; s--) {
			System.out.println("");
			for (int r = 1; r <= s; r++) {
				System.out.print("*");
			}
		}
		System.out.println();
		System.out.println("==========");
		
		for (int s = 1; s<=5; s++ ) {
			System.out.print("\t ");
			for (int r = 1; r<=5; r++ ) {
				System.out.println("*");
			}
		}*/
	}
}

