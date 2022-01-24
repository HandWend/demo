/**
 * 반복 제어: continue
 * @author smart02 ★
 */
public class Loop14 {

	public static void main(String[] args) {
		
		for (int s = 0; s < 10; s++) {
			// System.out.println(s); 5 들어감.
			// (1) if s == 5 continue
			// (2) s % = 1, continue
			// (3) s % 2 = 0, continue
			if (s %2 == 0) {
			continue;
			}
			System.out.println(s); // 5 들어가지 않음.
		}
	}
}
