/**
 * �־��� �迭 �ȿ��� max ���� ����ض�. (for ���� ���)
 * @author smart02
 *
 */
public class StringExam3 {
	
	public static void main(String[] args) {
		int max = 0;
		int[] arr = {1, 5, 3, 8, 2};
		
		// �ۼ�����
		for (int i = 0; i<arr.length; i++) {
				if (arr[i] > max) {
					max = arr[i];
				}
		}
	System.out.println("max: " + max);
	}
	
}


