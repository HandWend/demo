import java.util.Arrays;
import java.util.HashSet;

/**
 * �ζ�
 * @author smart02
 *
 */
public class Test {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>(); // �׸� �ڽ� ���� �� �ȿ� ���� �ֱ�
		for (int i=0; i<5; i++)
		while(true) {
			hs.add((int)(Math.random()*45)+1);
			System.out.println((int)(Math.random()*45)+1);
			
			if(hs.size() == 6 ) {
				break; // �ݺ��� ��������.
			}
		}
		
		// 2022-01-15 �ζ� 1�� ��ȣ 6�� ���
		System.out.println(hs);
	}

}
