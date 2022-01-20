import java.util.Scanner;
/**
 * @author smart02
 * n * n ������ 
*/
public class ArrayExam11 {

	public static void main(String[] args) {
		// ������ ���� ���Ͻÿ�.
		int cube = 7;  // ������ n�� cube ���� �ٲ��ָ� ��.
		int sum = 0;	// 1���� 25�� ��
		int chkNum = 0;  // �ϳ��� ������ ��.
		
		// ��ü�� ���Ͻÿ�.
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
						}; // ������ üũ
		
		// ���ο� üũ
		int rowCntChk = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				 rowCntChk += arr[i][j];
			}
		}
		if (rowCntChk != (chkNum*cube)) {
			System.out.println("����1");
			return;
		}
		
		// ���ο� üũ
		int colCntChk = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				colCntChk += arr[j][i];
			}
		}
		if (colCntChk!=chkNum*cube) {
			System.out.println("����2");
			return;
		}
		
		// ���� �밢�� ������ ������ �Ʒ��� 
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
			System.out.println("����3");
			return;
		}
		
		// ������ ������ ���� �Ʒ���
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
			System.out.println("����4");
			return;
		}
		System.out.println("����");
	}
}
