
public class Operator4 {

	public static void main(String[] args) { // country
		{	// ��� > �� > �� > ����
			// ���� > ���� > ����
			// ���������� ++, --
			int i = 0;
			i++; // ����������
			i++; 
			System.out.println(i);
			++i; // ����������
			System.out.println(i);
		}
		{
			int i = 0;
			System.out.println("--------------------------");
			System.out.println(i++);
			System.out.println(i);
			System.out.println(i++);
			System.out.println(i);
			System.out.println(++i);
			System.out.println(i++);
			System.out.println(i);
		}
		{
			int i = 0, j = 1;
			System.out.println("--------------------------");
			System.out.println(i++ + i + ++j);
		}
		{
			int i = 0;
			System.out.println("--------------------------");
			System.out.println(++i);
			System.out.println(i++); 
			System.out.println(i);
		}
		{
			// ���������� !
			boolean b = false;
			System.out.println("--------------------------");
			System.out.println(b);
			System.out.println(!b);
			
		}
		{
			// �񱳿����� >, >=, <, <=, ==, != ����� boolean type
			int m = 10, n = 5;
			System.out.println("--------------------------");
			System.out.println(m > n);
			System.out.println(m >= n);
			System.out.println(m < n);
			System.out.println(m <= n);
			System.out.println(m == n);
			System.out.println(m != n);
		}
		{
			// �������� ( and[&&] or[[||] nor[!] )
			// &&: �Ѵ� true�� ���� true
			// ||: �ϳ��� true�� true
			// ^: �ϳ��� true���� true
			System.out.println("--------------------------");
			System.out.println(false && false);
			System.out.println(false && true);
			System.out.println(true && false);
			System.out.println(true && true);
		}
		{
			System.out.println("--------------------------");
			System.out.println(false || false);
			System.out.println(false || true);
			System.out.println(true || false);
			System.out.println(true || true);
		}
		{
			System.out.println("--------------------------");
			System.out.println(false ^ false);
			System.out.println(false ^ true);
			System.out.println(true ^ false);
			System.out.println(true ^ true);
		}
		{
			System.out.println("--------------------------");
			System.out.println(!false);
			System.out.println(!true);
		}
		{
			System.out.println("--------------------------");
			System.out.println(false && false);
			System.out.println(false && true);
			System.out.println(true && false);
			System.out.println(true && !true);
		}
		{
			// ��Ʈ������ &(and) |(or) ^(nor) ~(not) <<(shift) >> >>>
			// &: �� �� 1�� ���� 1
			// |: 1�� �ϳ��� ������ 1
			// ^: 1�� �ϳ��� �־�� 1, 2�� ������ 0, ��� 0
			byte bitNum1 = 15;
			byte bitNum2 = 20; // ��Ʈ�����ڿ� byte��
			System.out.println("--------------------------");
			System.out.println(bitNum1 + bitNum2);
			System.out.println(bitNum1 & bitNum2);
			System.out.println(bitNum1 | bitNum2);
			System.out.println(~bitNum1); // 1�� ����(?)
			System.out.println(~bitNum2); // ������ +1 �� (-) ��ȣ ������.
			System.out.println(bitNum1 ^ bitNum2);
			System.out.println("--------------------------");
			System.out.println(bitNum2<<1); // ���ϱ� 2 '�� ��'
			System.out.println(bitNum2>>1); // ������ 2 '�� ��'
			System.out.println(bitNum2<<2); // ���ϱ� 2 '�� ��'
			System.out.println(bitNum2>>2); // ������ 2 '�� ��'
			System.out.println(bitNum2 >>> 1);
			System.out.println(~bitNum2 >>> 1);
		}
	}

}
