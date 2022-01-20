import java.util.Arrays;
import java.util.HashSet;

/**
 * 로또
 * @author smart02
 *
 */
public class Test {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>(); // 네모 박스 만들어서 그 안에 숫자 넣기
		for (int i=0; i<5; i++)
		while(true) {
			hs.add((int)(Math.random()*45)+1);
			System.out.println((int)(Math.random()*45)+1);
			
			if(hs.size() == 6 ) {
				break; // 반복문 빠져나감.
			}
		}
		
		// 2022-01-15 로또 1등 번호 6개 출력
		System.out.println(hs);
	}

}
