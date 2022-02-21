
import java.util.Random;

public class Exam4 {

	public void method(int [] iArr) {
			// 여기에 코딩하세요. Start
		
			for (int i = 0; i < iArr.length; i++) {
				System.out.print(iArr[i] + " ");
			}
			for (int i = 0; i < iArr.length; i++) {
				for (int j = i + 1; j < iArr.length; j++) {
					if (iArr[i] > iArr[j]) {
						int bowl = iArr[i];
						iArr[i] = iArr[j];
						iArr[j] = bowl;		
					}
				}
			}
			System.out.println();
			for (int i : iArr) {
				System.out.print(i + " ");
			}
		
	}
	// coding end

	public static void main(String[] args) {
		// 5칸의 정수 배열생성
		int[] iArr = new int[5];

		// 임의의 값을 배열에 저장
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = new Random().nextInt(10);
		}
		// method 호출
		new Exam4().method(iArr);
	}
}
