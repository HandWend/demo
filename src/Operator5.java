
public class Operator5 {

	public static void main(String[] args) { // country
		// ���Կ����� (=, +=, -=, *=, /=, %= ...)
		System.out.println("--------------------------");
		{	
			// += ������
			int x = 1, y = 2;
			// x = x + y;
			x+=y;
			System.out.println(x);	
		}
		{
			// -= ������
			int x = 1, y = 2;
			// x = x -y;
			x-=y;
			System.out.println(x);	
		}
		{
			// ���׿����� (���ǹ�) ? ��:����;
			// ���輺���� 60�� �̸��̸� �����, �̻��̸� ���
			int score = 100;
			String str = (score < 60) ? "�����" : "Pass";
			System.out.println(str);	
			
		}	
	}

}
