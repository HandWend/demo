/**
 * Ȧ¦ Ȯ�� ���α׷� �ۼ��Ͻÿ�
 * @author smart02
 *
 */
public class Controlflow8 {

	public static void main(String[] args) {
		/*int i=59;
		// System.out.println("[DEG]"+(i%2==0));
		if (i % 2 == 0) {
			System.out.println("i�� ¦���Դϴ�.");
		} else { 
			System.out.println("i�� Ȧ���Դϴ�."); 
		}*/

		/*int i=1;
		if (i % 3 == 1 ) {
			System.out.println("�մ��� �¸��Դϴ�.");
		}
		else if (i % 3==2) {
			System.out.println("�մ��� �¸��Դϴ�.");
		}else {
			System.out.println("���� �¸��Դϴ�.");
		}*/
	
		//���������� ���α׷��� �ۼ��Ͻÿ�
		int user1 = (int)(Math.random()*3)+1; //����
		int user2 = (int)(Math.random()*3)+1; //����
		
		if (user1==1) {
			System.out.println("���� ����");
		} else if (user1==2) {
			System.out.println("���� ����");
		} else { 
			System.out.println("���� ��");
		}
		
		if (user2==1) {
			System.out.println("������ ����");
		} else if (user2==2) {
			System.out.println("������ ����");
		} else { 
			System.out.println("������ ��");
		}
		if (user1 == 1 && user2==1) {
			System.out.println("�����ϴ�.");
		} else if (user1==1 && user2 ==2) {
			System.out.println("�Ф�");
		} else if (user1==1 && user2==3) {
			System.out.println("����");
		} else if(user1 == 2 && user2==1) {
			System.out.println("����");
		} else if (user1==2 && user2==2) {
			System.out.println("���");
		} else if (user1==2 && user2==3) {
			System.out.println("�Ф�");
		} else if(user1 ==3 && user2==1) {
			System.out.println("�Ф�");
		} else if (user1==3 && user2==2) {
			System.out.println("����");
		} else if (user1==3 && user2==3) {
			System.out.println("���.");
		} 
		
	}
}
	