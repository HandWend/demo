import java.util.Scanner;

/**
 * ���� ���α׷� �ۼ��Ͻÿ�
 * @author smart02
 *
 */
public class Controlflow11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // ��ĳ�� Ŭ����
		System.out.println("������ �Է��ϼ���."); 
		
		
		int longevity = 0; // 1����
		
		do {
			System.out.println("usage: ������� �Է��ϼ���");
			longevity = scan.nextInt();
		} while (longevity<1);
		
		int longevityYear = longevity / 12;  // ���� ���� ���.
		if (longevity %12 >0 ) { 			 
			longevityYear ++;				 // �������� ����� +1
		}
		// �Ի� �� ���Ի���� ���� 11���� ���հ��.
		switch (longevityYear) {
		case 1: System.out.println("���������� "+(longevity - 1)+"��"); break; 
		// 2���� 1��, 3���� 2��, 4���� 3��, 5���� 4�� �� �ϳ��� ���ֱ�.
		case 2: System.out.println("15��"); break;
		case 3: case 4: System.out.println("16��"); break;
		case 5: case 6: System.out.println("17��"); break;
		case 7: case 8: System.out.println("18��"); break;
		case 9: case 10: System.out.println("19��"); break;
		case 11: case 12: System.out.println("20��"); break;
		case 13: case 14: System.out.println("21��"); break;
		case 15: case 16: System.out.println("22��"); break;
		case 17: case 18: System.out.println("23��"); break;
		case 19: case 20: System.out.println("24��"); break;
		default: System.out.println("25��"); break;
		}
		
	}
}
	