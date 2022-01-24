/**
 * 주어진 배열 안에서 max 값을 출력해라. (for 구문 사용)
 * @author smart02
 *
 */
public class StringExam4 {
	
	public static void main(String[] args) {
		int [][] arr = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int sum = 0;
		double avg = 0.0;

		// write here with for 중첩문
		for (int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		// write end
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		
	}
	
}


