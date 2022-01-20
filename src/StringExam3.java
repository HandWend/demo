/**
 * 주어진 배열 안에서 max 값을 출력해라. (for 구문 사용)
 * @author smart02
 *
 */
public class StringExam3 {
	
	public static void main(String[] args) {
		int max = 0;
		int[] arr = {1, 5, 3, 8, 2};
		
		// 작성시작
		for (int i = 0; i<arr.length; i++) {
				if (arr[i] > max) {
					max = arr[i];
				}
		}
	System.out.println("max: " + max);
	}
	
}


