import java.util.Scanner;
/**
 * @author smart02
*/
public class ArrayExam8 {

	public static void main(String[] args) {
		int cube = 5;
		int sum = 0;
		int chkNum =0;
		
		for (int i = 1; i<= (cube * cube); i++) {
			sum+=i;
		}
		chkNum = (sum / (cube * cube) *cube);
		
		int[][] arr = { { 11, 18, 25, 2, 9 }, 
						{ 10, 12, 19, 21, 3 }, 
						{ 4, 6, 13, 20, 22 },
						{23, 5, 7, 14, 16},
						{17, 24, 1, 8, 15}
						}; // 마방진 체크
		// 1
		int rowCntChk = 0;
		for (int i = 0; i < arr.length; i++) {
			// 2
			
			for (int j = 0; j < arr[i].length; j++) {
				 rowCntChk += arr[i][j];
			}
		}
		if (rowCntChk != (chkNum*cube)) {
			System.out.println("오답");
			return;
		}
		int colCntChk = 0;
		// 세로값 15체크
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				colCntChk += arr[j][i];
			}
		}
		if (colCntChk!=chkNum*cube) {
			System.out.println("오답");
			return;
		}; // 열 체크
		int leftTop = 0;
		for (int i = 0; i < arr.length; i++) {
			// 2
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					leftTop += arr[j][i];
				}
			}
		}
		if (leftTop != chkNum) {
			System.out.println("오답");
			return;
		}
		int rightTop = 0;
		for (int i = 0; i < arr.length; i++) {
			// 2
			for (int j = 0; j < arr.length; j++) {
				if (i + j== 2) {
					rightTop += arr[j][i];
				}
			}
		}
		if (rightTop != chkNum) {
			System.out.println("오답");
			return;
		}
		System.out.println("정답");
	}
}
