import java.util.Scanner;
/**
 * @author smart02
 * n * n 마방진 
*/
public class ArrayExam11 {

	public static void main(String[] args) {
		// 마방진 수를 구하시오.
		int cube = 7;  // 마방진 n단 cube 값만 바꿔주면 됨.
		int sum = 0;	// 1부터 25의 합
		int chkNum = 0;  // 하나의 라인의 합.
		
		// 전체합 구하시오.
		for (int i = 1; i<= (cube * cube); i++) {
			sum +=i;
		}
		chkNum= (sum / (cube * cube) *cube);
		 System.out.println(chkNum);
		
		int[][] arr = { { 29, 27, 18, 9, 7, 47, 38 }, 
						{ 37, 35, 26, 17, 8, 6, 46 }, 
						{ 45, 36, 34, 25, 16, 14, 5 },
						{4, 44, 42, 33, 24, 15, 13},
						{12, 3, 43, 41, 32, 23, 21},
						{20, 11, 2, 49, 40, 31, 22},
						{28, 19, 10, 1, 48, 39, 30}
						}; // 마방진 체크
		
		// 가로열 체크
		int rowCntChk = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				 rowCntChk += arr[i][j];
			}
		}
		if (rowCntChk != (chkNum*cube)) {
			System.out.println("오답1");
			return;
		}
		
		// 세로열 체크
		int colCntChk = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				colCntChk += arr[j][i];
			}
		}
		if (colCntChk!=chkNum*cube) {
			System.out.println("오답2");
			return;
		}
		
		// 왼쪽 대각선 위에서 오른쪽 아래로 
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
			System.out.println("오답3");
			return;
		}
		
		// 오른쪽 위에서 왼쪽 아래로
		int rightTop = 0;
		for (int i = 0; i < arr.length; i++) {
			// 2
			for (int j = 0; j < arr.length; j++) {
				if (i + j== (cube-1)) {
					rightTop += arr[j][i];
				}
			}
		}
		if (rightTop != chkNum) {
			System.out.println("오답4");
			return;
		}
		System.out.println("정답");
	}
}
