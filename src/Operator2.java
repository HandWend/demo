
public class Operator2 {

	public static void main(String[] args) { // country
		// ��������� [+ - * / %]
		double i = 10;
		int j = 3;
		// double�� int�� ������ doubleó�� ����.
		
		System.out.printf("%2.2f + %d = %2.2f\n", i, j, i+j); // ���ϱ�
		System.out.println(i-j); // ����
		System.out.println(i*j); // ���ϱ�
		System.out.println(i/j); // ������
		System.out.printf("%.1f\n",i%j);
		System.out.printf("%.2f\n",i%j);
		System.out.printf("%.3f\n",i%j);
		
		System.out.println(i%j); // ������
		
		
	}

}
